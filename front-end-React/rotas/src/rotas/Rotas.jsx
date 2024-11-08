import React from "react";
import Home from "./pages/home/Home";
import Contato from "./pages/contato/Contato";
import { BrowserRouter as Router } from "react-router-dom";
import { Routes } from "react-router-dom";
import { Route } from "react-router-dom";

export default function AppRoutes() {
    return (
        <Router>
            <Routes>
                <Route path="/" element={<Home />}></Route>
                <Route path="/contato" element={<Contato />}></Route>
            </Routes>
        </Router>
    )
}