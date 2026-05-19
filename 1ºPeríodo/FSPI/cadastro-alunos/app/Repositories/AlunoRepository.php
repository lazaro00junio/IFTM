<?php
class AlunoRepository
{
    public function salvar(array $dados): bool
    {
        //conecta-se ao banco de dados
        $pdo = Database::conectar();
        //insere os valores no banco de dados
        $sql = "INSERT INTO alunos (nome, email, curso)
VALUES (:nome, :email, :curso)";
        $stmt = $pdo->prepare($sql);
        return $stmt->execute([
            ':nome' => $dados['nome'],
            ':email' => $dados['email'],
            ':curso' => $dados['curso']
        ]);
    }
}
