<?php
class AlunoService
{
    public function criar(array $dados): array
    {
        // Recebe e limpa os dados vindos do formulário
        $nome = trim($dados['nome'] ?? '');
        $email = trim($dados['email'] ?? '');
        $curso = trim($dados['curso'] ?? '');
        // Regra 1: nome obrigatório
        if ($nome === '') {
            return ['erro' => 'O nome é obrigatório.'];
        }
        // Regra 2: nome deve ter pelo menos 3 caracteres
        if (strlen($nome) < 3) {
            return [
                'erro' => 'O nome deve ter pelo menos 3
caracteres.'
            ];
        }
        // Regra 3: e-mail obrigatório
        if ($email === '') {
            return ['erro' => 'O e-mail é obrigatório.'];
        }
        // Regra 4: e-mail deve ter formato válido
        if (!filter_var($email, FILTER_VALIDATE_EMAIL)) {
            return ['erro' => 'O e-mail informado é inválido.'];
        }
        // Regra 5: curso obrigatório
        if ($curso === '') {
            return ['erro' => 'O curso é obrigatório.'];

        }
        // Após validar os dados, chama o Repository para salvar no banco
        $repository = new AlunoRepository();
        $repository->salvar([
            'nome' => $nome,
            'email' => $email,
            'curso' => $curso
        ]);
        return ['sucesso' => 'Aluno salvo com sucesso.'];
    }
}
