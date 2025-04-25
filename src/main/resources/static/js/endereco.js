async function buscarEndereco() {
    const cep = document.getElementById('cep').value;
    const url = `http://localhost:8080/api/v1/endereco/buscar/${cep}`;

    try {
        const response = await fetch(url);
        if (!response.ok) {
            throw new Error("Erro ao buscar o endereço. Verifique o CEP.");
        }
        const endereco = await response.json();

        document.getElementById('logradouro').textContent = endereco.logradouro || '';
        document.getElementById('complemento').textContent = endereco.complemento || '';
        document.getElementById('unidade').textContent = endereco.unidade || '';
        document.getElementById('bairro').textContent = endereco.bairro || '';
        document.getElementById('localidade').textContent = endereco.localidade || '';
        document.getElementById('uf').textContent = endereco.uf || '';
        document.getElementById('estado').textContent = endereco.estado || '';
        document.getElementById('regiao').textContent = endereco.regiao || '';
        document.getElementById('ibge').textContent = endereco.ibge || '';
        document.getElementById('gia').textContent = endereco.gia || '';
        document.getElementById('ddd').textContent = endereco.ddd || '';
        document.getElementById('siafi').textContent = endereco.siafi || '';
    } catch (error) {
        alert(error.message);
    }
}
