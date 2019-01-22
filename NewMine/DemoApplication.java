package com.example.demo;
import com.example.demo.entity.*;
import com.example.demo.repository.*;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
//import java.util.stream.Stream;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	ApplicationRunner init(CountryCodeRepository countryCodeRepository,
						   CustomerRepository customerRepository,SexRepository sexRepository,
						   TitleNameRepository titleNameRepository) {
		return args -> {
			//Insert Country_code
			//NORTH AMERICA
			CountryCodeEntity Alaska = new CountryCodeEntity("+1+907 (อะเเลสกา)");
			countryCodeRepository.save(Alaska);
			CountryCodeEntity Canada = new CountryCodeEntity("+1 (แคนาดา)");
			countryCodeRepository.save(Canada);
			CountryCodeEntity Hawaii = new CountryCodeEntity("+1+808 (ฮาวาย)");
			countryCodeRepository.save(Hawaii);
			CountryCodeEntity USA = new CountryCodeEntity("+1 (สหรัฐอเมริกา)");
			countryCodeRepository.save(USA);
			//ASIA
			CountryCodeEntity Bangladesh = new CountryCodeEntity("+880 (บังคลาเทศ)");
			countryCodeRepository.save(Bangladesh);
			CountryCodeEntity Bhutan = new CountryCodeEntity("+975 (ภูฏาน)");
			countryCodeRepository.save(Bhutan);
			CountryCodeEntity Brunei = new CountryCodeEntity("+673 (บรูไน)");
			countryCodeRepository.save(Brunei);
			CountryCodeEntity Cambodia = new CountryCodeEntity("+855 (กัมพูชา)");
			countryCodeRepository.save(Cambodia);
			CountryCodeEntity China = new CountryCodeEntity("+86 (จีน)");
			countryCodeRepository.save(China);
			CountryCodeEntity Laos = new CountryCodeEntity("+856 (ลาว)");
			countryCodeRepository.save(Laos);
			CountryCodeEntity Malaysia = new CountryCodeEntity("+856 (มาเลเซีย)");
			countryCodeRepository.save(Malaysia);
			CountryCodeEntity Hongkong = new CountryCodeEntity("+852 (ฮ่องกง)");
			countryCodeRepository.save(Hongkong);
			CountryCodeEntity India = new CountryCodeEntity("+91 (อินเดีย)");
			countryCodeRepository.save(India);
			CountryCodeEntity Indonesia = new CountryCodeEntity("+62 (อินโดนีเซีย)");
			countryCodeRepository.save(Indonesia);
			CountryCodeEntity Japan = new CountryCodeEntity("+81 (ญี่ปุ่น)");
			countryCodeRepository.save(Japan);
			CountryCodeEntity Koreasouth = new CountryCodeEntity("+82 (เกาหลีใต้)");
			countryCodeRepository.save(Koreasouth);
			CountryCodeEntity Macao = new CountryCodeEntity("+853 (มาเก๊า)");
			countryCodeRepository.save(Macao);
			CountryCodeEntity Maldives = new CountryCodeEntity("+960 (มัลดีฟส์)");
			countryCodeRepository.save(Maldives);
			CountryCodeEntity Mongolia = new CountryCodeEntity("+976 (มองโกเลีย)");
			countryCodeRepository.save(Mongolia);
			CountryCodeEntity Myanmar = new CountryCodeEntity("+95 (พม่า)");
			countryCodeRepository.save(Myanmar);
			CountryCodeEntity Nepal = new CountryCodeEntity("+977 (เนปาล)");
			countryCodeRepository.save(Nepal);
			CountryCodeEntity Pakistan = new CountryCodeEntity("+92 (ปากีสถาน)");
			countryCodeRepository.save(Pakistan);
			CountryCodeEntity Philippines = new CountryCodeEntity("+63 (ฟิลิปปินส์)");
			countryCodeRepository.save(Philippines);
			CountryCodeEntity Singapore = new CountryCodeEntity("+65 (สิงคโปร์)");
			countryCodeRepository.save(Singapore);
			CountryCodeEntity Srilanka = new CountryCodeEntity("+94 (ศรีลังกา)");
			countryCodeRepository.save(Srilanka);
			CountryCodeEntity Thailand = new CountryCodeEntity("+66 (ไทย)");
			countryCodeRepository.save(Thailand);
			CountryCodeEntity Taiwan = new CountryCodeEntity("+886 (ไต้หวัน)");
			countryCodeRepository.save(Taiwan);
			CountryCodeEntity Vietnam = new CountryCodeEntity("+84 (เวียดนาม)");
			countryCodeRepository.save(Vietnam);

			// Australia, New Zealand
			CountryCodeEntity Australia = new CountryCodeEntity("+61 (ออสเตรเลีย)");
			countryCodeRepository.save(Australia);
			CountryCodeEntity Newzealand = new CountryCodeEntity("+64 (นิวซีแลนด์)");
			countryCodeRepository.save(Newzealand);
			//PACIFIC OCEAN
			CountryCodeEntity AmericanSamoa = new CountryCodeEntity("+684 (อเมริกันซามัว)");
			countryCodeRepository.save(AmericanSamoa);
			CountryCodeEntity Fiji = new CountryCodeEntity("+679 (ฟีจี)");
			countryCodeRepository.save(Fiji);
			CountryCodeEntity Frenchpolynesia = new CountryCodeEntity("+689 (เฟรนช์พอลินีเชีย)");
			countryCodeRepository.save(Frenchpolynesia);
			CountryCodeEntity Guam = new CountryCodeEntity("+1+671 (กวม)");
			countryCodeRepository.save(Guam);
			CountryCodeEntity Micronesia = new CountryCodeEntity("+691 (ไมโครนีเซีย)");
			countryCodeRepository.save(Micronesia);
			CountryCodeEntity Nauru = new CountryCodeEntity("+674 (นาอูรู)");
			countryCodeRepository.save(Nauru);
			CountryCodeEntity Newcaledonia = new CountryCodeEntity("+687 (นิวแคลิโดเนีย)");
			countryCodeRepository.save(Newcaledonia);
			CountryCodeEntity Papuanewguinea = new CountryCodeEntity("+675 (ปาปัวนิวกินี)");
			countryCodeRepository.save(Papuanewguinea);
			CountryCodeEntity Saipan = new CountryCodeEntity("+1+670 (เกาะไซปัน)");
			countryCodeRepository.save(Saipan);
			CountryCodeEntity Tokelau = new CountryCodeEntity("+690 (โทเคอเลา)");
			countryCodeRepository.save(Tokelau);


			//Insert Sex
			SexEntity m = new SexEntity("ชาย");
			sexRepository.save(m);
			SexEntity fm = new SexEntity("หญิง");
			sexRepository.save(fm);
			SexEntity nfmm = new SexEntity("-ไม่ระบุ-");
			sexRepository.save(nfmm);

			//Insert Title_name
			TitleNameEntity a = new TitleNameEntity("นาย");
			titleNameRepository.save(a);
			TitleNameEntity b = new TitleNameEntity("นาง");
			titleNameRepository.save(b);
			TitleNameEntity c = new TitleNameEntity("นางสาว");
			titleNameRepository.save(c);

			//Insert Customer
			CustomerEntity e = new CustomerEntity();
			CountryCodeEntity cc = countryCodeRepository.findBycountrycode("+1 (แคนาดา)");
			e.setCountry(cc);
			SexEntity ss = sexRepository.findBycustomersex("ชาย");
			e.setCustomersex(ss);
			TitleNameEntity tn = titleNameRepository.findBytitlename("นาย");
			e.setTitleName(tn);
			customerRepository.save(e);

		};
	}

}

