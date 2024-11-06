import { useState } from 'react';
import { FaCat } from "react-icons/fa";
import './App.css';
import api from '../../service/api';

export default function App() {
  const [cat, setCat] = useState(null);

  async function findCat() {
    try {
      const response = await api.get();
      setCat(response.data[0]);
    } catch {
      alert("Ops! O gato fugiu!");
    }
  }

  return (
    <div className='container'>
      <h1 className='texto-claro'>Imagens de Gatos<span>.</span></h1>
      <h4 className='texto-claro'>Clique no botão a baixo para ver fotos de gatos aleatorias</h4>
      {cat && (
        <img src={cat.url} className='img-gato'/>
      )}
      <button className='btn-procura-gato' onClick={findCat}>
        <FaCat />
      </button>
    </div>
  )
}