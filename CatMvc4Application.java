package ma.infoMed;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import ma.infoMed.dao.ProduitRepository;
import ma.infoMed.entities.Produit;

@SpringBootApplication
public class CatMvc4Application {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(CatMvc4Application.class, args);
		ProduitRepository produitRepository=ctx.getBean(ProduitRepository.class);
		produitRepository.save(new Produit("HP2500", 8000, 20));
		produitRepository.save(new Produit("Lenovo3500", 6000, 15));
		produitRepository.save(new Produit("Imprimante hp", 15000, 5));
		produitRepository.save(new Produit("Dell", 9000, 30));
		
		produitRepository.findAll().forEach(p->System.out.println(p.getDesignation()));
	}
}
