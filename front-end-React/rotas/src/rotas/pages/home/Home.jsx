import React, { useEffect } from "react";
import BotaoNavegar from "../../components/botaoNavegar/BotaoNavegar";
import "./style.css"
import Navbar from "../../components/navbar/NavBar";

export default function Home() {
    useEffect(() => {
        document.title = "Hotel - Home"
    })

    return (
        <>
        <Navbar/>
        <div className="container">
            <div className="row mt-5 gap-5 d-flex justify-content-center">
                <div className="col-xl-5 txt-topo d-flex flex-column justify-content-end">
                    <h1>Hotel Água da Serra</h1>
                    <p>Bem-vindo ao Hotel Água da Serra, um refúgio encantador onde conforto, natureza e hospitalidade se encontram para proporcionar uma experiência inesquecível. Situado em um cenário deslumbrante cercado por montanhas e rios cristalinos, o Água da Serra é o destino ideal para quem busca descanso e aventura em um só lugar.</p>
                    <BotaoNavegar caminho="/contato" className="botaoNavegar">Página Contato - Clique Aqui!</BotaoNavegar>
                </div>
                <div className="col-xl-5 img-topo">
                    <img src="src\assets\img\hotel-faixada.webp" />
                </div>
            </div>
        </div>
        </>
    )
}