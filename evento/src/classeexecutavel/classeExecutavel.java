package classeexecutavel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import model.Area;
import model.Artigo;
import model.Autor;
import model.MiniCurso;
import model.Palestra;

public class classeExecutavel {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		Autor autor1 = new Autor("Jenifer", "jeni@g", 99999999);
		Autor autor2 = new Autor("Luan", "jhsh@sh", 2222222);
		Autor autor3 = new Autor("Luna", "lsu@g", 333333333);

		Area area1 = new Area("java web");
		Area area2 = new Area("Banco de dados");
		Area area3 = new Area("Portugol");

		Artigo artigo1 = new Artigo();
		artigo1.setResumo("Nao sei");
		artigo1.setSituacao(0);
		artigo1.setAutor(autor1);
		artigo1.setArea(area3);
		artigo1.setTitulo("aNod");


		SimpleDateFormat formatodata = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat formatohora = new SimpleDateFormat("HH:mm");

		String data = "08/07/2022";
		Date date1 = formatodata.parse(data);
		String hora = "19:00";
		Date hora1 = formatohora.parse(hora);

		Palestra palestra1 = new Palestra("Nao sei Mais", 1, autor1, area2, "Analisando", date1, hora1);

		String hora_inicio = "18:00";
		String hora_fim = "21:00";
		data = "09/07/2022";
		Date hInicio = formatohora.parse(hora_inicio);
		Date hFim = formatohora.parse(hora_fim);
		date1 = formatodata.parse(data);

		hora_inicio = "17:00";
		hora_fim = "22:00";
		data = "09/07/2022";
		hInicio = formatohora.parse(hora_inicio);
		hFim = formatohora.parse(hora_fim);
		date1 = formatodata.parse(data);

		MiniCurso miniCurso1 = new MiniCurso("PortugolStudio", 3, autor2, area3, 3, date1, hInicio, hFim);

		MiniCurso miniCurso2 = new MiniCurso("C++", 2, autor3, area2, 3, date1, hInicio, hFim);

		System.out.println("Artigo -------------------------------------------------");
		System.out.println("Descricao .........: " + artigo1.getResumo());
		System.out.println("Titulo ............: " + artigo1.getTitulo());
		System.out.println("Situacao ..........: " + artigo1.avaliar(artigo1.getSituacao()));
		System.out.println("Autor .............: " + artigo1.getAutor().getNome());
		System.out.println("Area ..............: " + artigo1.getArea().getDescricao());
		System.out.println("Pagar Taxa?..............: " + artigo1.aplicarTaxa());

		System.out.println("Palestra -------------------------------------------------");
		System.out.println("Descricao .........: " + palestra1.getDescricao());
		System.out.println("Data ..............: " + formatodata.format(palestra1.getData()));
		System.out.println("Hora ..............: " + formatohora.format(palestra1.getHora()));
		System.out.println("Titulo ............: " + palestra1.getTitulo());
		System.out.println("Situacao ..........: " + palestra1.avaliar(palestra1.getSituacao()));
		System.out.println("Autor .............: " + palestra1.getAutor().getNome());
		System.out.println("Area ..............: " + palestra1.getArea().getDescricao());

		System.out.println("MiniCurso -------------------------------------------------");
		System.out.println("Titulo ............: " + miniCurso1.getTitulo());
		System.out.println("Data ..............: " + formatodata.format(miniCurso1.getData()));
		System.out.println("Hora Inicio .......: " + formatohora.format(miniCurso1.getHoraInicio()));
		System.out.println("Hora Fim ..........: " + formatohora.format(miniCurso1.getHoraFim()));
		System.out.println("Situacao ..........: " + miniCurso1.avaliar(miniCurso1.getSituacao()));
		System.out.println("Autor .............: " + miniCurso1.getAutor().getNome());
		System.out.println("Area ..............: " + miniCurso1.getArea().getDescricao());

		System.out.println("MiniCurso -------------------------------------------------");
		System.out.println("Titulo ............: " + miniCurso2.getTitulo());
		System.out.println("Data ..............: " + formatodata.format(miniCurso2.getData()));
		System.out.println("Hora Inicio .......: " + formatohora.format(miniCurso2.getHoraInicio()));
		System.out.println("Hora Fim ..........: " + formatohora.format(miniCurso2.getHoraFim()));
		System.out.println("Situacao ..........: " + miniCurso2.avaliar(miniCurso1.getSituacao()));
		System.out.println("Autor .............: " + miniCurso2.getAutor().getNome());
		System.out.println("Area ..............: " + miniCurso2.getArea().getDescricao());

		System.out.println("---------------------------------------------------------------");
		System.out.println(miniCurso1.getTotal());
		System.out.println(palestra1.getTotal());
		System.out.println(artigo1.getTotal());

	}

}