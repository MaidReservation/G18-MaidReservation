package com.kota.developer.demo;
import com.kota.developer.demo.Entity.*;
import com.kota.developer.demo.Repository.*;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;
import java.util.stream.Stream;

@CrossOrigin(origins = "http://localhost:4200")
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	ApplicationRunner init(RegisterRepository registerRepository, TitleNameRepository titleNameRepository,
						   TypeworkingRepository typeworkingRepository, WorkingDateRepositoy workingDateRepositoy) {
		return args -> {

		Stream.of("นาง","นางสาว","นาย").forEach(title ->{

			if(title.equals("นาง")){
				TitleName titleNameEntity = new TitleName();
				titleNameEntity.setTitlenameType("นาง");
				titleNameRepository.save(titleNameEntity);
			}

			if(title.equals("นางสาว")){
				TitleName titleNameEntity = new TitleName();
				titleNameEntity.setTitlenameType("นางสาว");
				titleNameRepository.save(titleNameEntity);
			}

			if(title.equals("นาย")){
				TitleName titleNameEntity = new TitleName();
				titleNameEntity.setTitlenameType("นาย");
				titleNameRepository.save(titleNameEntity);
			}

		});

			Stream.of("แม่บ้าน","แม่บ้านดูแลเด็ก","แม่บ้านดูแลเผู้สูงอายุ","คนดูแดสวน","คนขับรถ").forEach(typeworking ->{
				if(typeworking.equals("แม่บ้าน")){
					Typeworking typeworkingEntity = new Typeworking();
					typeworkingEntity.setTypeworking("แม่บ้าน");
					typeworkingRepository.save(typeworkingEntity);
				}
				if(typeworking.equals("แม่บ้านดูแลเด็ก")){
					Typeworking typeworkingEntity = new Typeworking();
					typeworkingEntity.setTypeworking("แม่บ้านดูแลเด็ก");
					typeworkingRepository.save(typeworkingEntity);
				}
				if(typeworking.equals("แม่บ้านดูแลเผู้สูงอายุ")){
					Typeworking typeworkingEntity = new Typeworking();
					typeworkingEntity.setTypeworking("แม่บ้านดูแลผู้สูงอายุ");
					typeworkingRepository.save(typeworkingEntity);
				}
				if(typeworking.equals("คนดูแดสวน")){
					Typeworking typeworkingEntity = new Typeworking();
					typeworkingEntity.setTypeworking("คนดูแดสวน");
					typeworkingRepository.save(typeworkingEntity);
				}
				if(typeworking.equals("คนขับรถ")){
					Typeworking typeworkingEntity = new Typeworking();
					typeworkingEntity.setTypeworking("คนขับรถ");
					typeworkingRepository.save(typeworkingEntity);
				}
			});

			Stream.of("ทำงานแบบรายวัน","ทำงานแบบรายสัปดาห์","ทำงานแบบรายเดือน","ทำงานแบบรายปี").forEach(workingDate ->{
				if(workingDate.equals("ทำงานแบบรายวัน")){
					WorkingDate workingDateEntity = new WorkingDate();
					workingDateEntity.setTypeworkingDate("ทำงานแบบรายวัน");
					workingDateRepositoy.save(workingDateEntity);
				}
				if(workingDate.equals("ทำงานแบบรายสัปดาห์")){
					WorkingDate workingDateEntity = new WorkingDate();
					workingDateEntity.setTypeworkingDate("ทำงานแบบรายสัปดาห์");
					workingDateRepositoy.save(workingDateEntity);
				}
				if(workingDate.equals("ทำงานแบบรายเดือน")){
					WorkingDate workingDateEntity = new WorkingDate();
					workingDateEntity.setTypeworkingDate("ทำงานแบบรายเดือน");
					workingDateRepositoy.save(workingDateEntity);
				}
				if(workingDate.equals("ทำงานแบบรายปี")){
					WorkingDate workingDateEntity = new WorkingDate();
					workingDateEntity.setTypeworkingDate("ทำงานแบบรายปี");
					workingDateRepositoy.save(workingDateEntity);
				}
			});
	};
}
}
