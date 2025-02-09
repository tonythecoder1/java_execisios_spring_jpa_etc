package testes_api;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class teste {

	public static void main(String[] args) {
		
		try {
			
			double longitude = 38.7169;
			double latitude = -9.139;
			
			
			String url = "https://api.open-meteo.com/v1/forecast?latitude=" + latitude +
                    "&longitude=" + longitude + "&current_weather=true";
			
			HttpClient client_http = HttpClient.newHttpClient();
			
			HttpRequest request = HttpRequest.newBuilder()
					.uri(URI.create(url))
					.build();
			
			
			HttpResponse<String> resposta = client_http.send(request, HttpResponse.BodyHandlers.ofString());
			
			System.out.println("Resposta da API: ");
			System.out.println(resposta.body());
			
			
		} catch (Exception e) {
			
			System.out.println("Erro ao chamar a API: " + e.getMessage());
			
		}
		
	}

	
}
