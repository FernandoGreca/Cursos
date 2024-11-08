import React from "react";
import "./style.css";

export default function BotaoNavegar(Props) {
    return (
        <button className="botaoNavegar">
            <a className="linkNavegar" href={Props.caminho}>{Props.children}</a>
        </button>
    )
}