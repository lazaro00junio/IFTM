<?php
class Database
{
    public static function conectar(): PDO
    {
        // define o host, o nome do banco de dados, o usuário como root e a senha como vazia.
        $host = 'localhost';
        $dbname = 'cadastro_alunos';
        $usuario = 'root';
        $senha = '';

        try {
            //tenta conectar-se ao banco de dados usando as informações das varíaveis.
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
            //caso a conexão falhe, o programa irá exibir esta mensagem.
            die('Erro ao conectar ao banco de dados: ' . $e->getMessage());
        }
    }
}
