import './style.css'
import Trash from '../../assets/trash.svg'

function Home() {

  const users = [{
    id: '12312rsufhsdj',
    nome: 'Rodolfo',
    idade: 22,
    email: 'rod@gmail.com'
  }, {
    id: '123342fgsasf',
    nome: 'Maria',
    idade: 18,
    email: 'maria@gmail.com'
  }, {
    id: '123asdr34fa',
    nome: 'Fernando',
    idade: 17,
    email: 'fernando@gmail.com'
  }]

  return (
    <div className='container'>
      <form>
        <h1>Cadastro de Usuários</h1>

        <input name='nome' type='text' placeholder='Nome' />
        <input name='idade' type='number' placeholder='Idade' />
        <input name='email' type='email' placeholder='E-mail' />

        <button type='button'>Cadastrar</button>
      </form>

      {users.map((user) => (
        <div key={user.id} className='card'>
          <div>
            <p>Nome: <span>{user.nome}</span></p>
            <p>Idade: <span>{user.idade}</span></p>
            <p>Email: <span>{user.email}</span></p>
          </div>
          <button>
            <img src={Trash} />
          </button>
        </div>
      ))}

    </div>
  )
}

export default Home
