<?php
class Database
{
    public static function conectar(): PDO
    {
        $host = 'localhost';

        $dbname = 'cadastro_alunos';
        $usuario = 'root';
        $senha = '';
        try {
            $pdo = new PDO(
                "mysql:host=$host;dbname=$dbname;charset=utf8mb4",
                $usuario,
                $senha
            );
            // Faz com que erros do banco sejam exibidos como exceções
            $pdo->setAttribute(
                PDO::ATTR_ERRMODE,
                PDO::ERRMODE_EXCEPTION
            );
            return $pdo;
        } catch (PDOException $e) {
            die('Erro ao conectar ao banco de dados: ' . $e->getMessage());
        }
    }
}