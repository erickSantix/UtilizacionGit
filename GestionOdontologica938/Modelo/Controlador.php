<?php

class Controlador {
    public function verPagina($ruta){
    require_once $ruta;
    }
}

require_once 'Controlador/Controlador.php';
require_once 'Modelo/GestorCita.php';
require_once 'Modelo/Cita.php';
require_once 'Modelo/Paciente.php';
require_once 'Modelo/Conexion.php';

$controlador = new Controlador();

if( isset($_GET["accion"])){
    if($_GET["accion"] == "asignar"){
    $controlador->verPagina('Vista/html/asignar.php');
    }
    if($_GET["accion"] == "consultar"){
    $controlador->verPagina('Vista/html/consultar.php');
    }
    if($_GET["accion"] == "cancelar"){
    $controlador->verPagina('Vista/html/cancelar.php');
    }
    } else {
    $controlador->verPagina('Vista/html/inicio.php');};


