
import './style.css';
import { useState } from 'react';
import { FiSearch } from 'react-icons/fi';

import api from '../../services/api';

export default function App() {
    const [input, setInput] = useState('');
    const [cep, setCep] = useState(null);

    async function handleSearch() {
        if (input === '') {
            alert('Preencha algum CEP!!')
            return;
        }

        try {
            // Realiza a busca na API com os valores do campo input
            const response = await api.get(`${input}/json`);
            // Salva os dados obtidos na variável 'cep'
            setCep(response.data);
        } catch {
            alert('Ops, erro ao buscar aqui :(')
        } finally {
            setInput(''); // Limpa o campo input
        }
    }

    return (
        <div className='container'>
            <h1 className='title'>Buscador Cep</h1>

            <div className='container-input'>
                <input
                    type='text'
                    placeholder='Digite seu cep...'
                    value={input}
                    onChange={(e) => setInput(e.target.value)}
                    maxLength={9} />

                <button className='button-search' onClick={handleSearch}>
                    <FiSearch
                        size={25}
                        color='#FFF' />
                </button>
            </div>

            {cep && (
                <main className='main'>
                    <h1>CEP: {cep.cep}</h1>

                    <span>{cep.logradouro}</span>
                    <span>Complemento: {cep.complemento}</span>
                    <span>{cep.bairro}</span>
                    <span>{cep.localidade} - {cep.uf}</span>
                    <span>DDD: {cep.ddd}</span>
                </main>
            )}

        </div>
    )
}