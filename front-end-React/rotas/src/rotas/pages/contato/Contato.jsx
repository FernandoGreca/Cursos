import React, { useEffect } from "react";
import BotaoHome from "../../components/botaoNavegar/BotaoNavegar";
import Navbar from "../../components/navbar/NavBar";

export default function Contato() {
    useEffect(() => {
        document.title = "Hotel - Contato"
    })

    return (
        <>
            <Navbar/>
            <div className="container mt-5">
                <h1>Página Contato</h1>
                <BotaoHome caminho="/">Página Home - Clique Aqui!</BotaoHome>
            </div>
        </>
    )
}