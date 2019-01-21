package sut.se.g18;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import sut.se.g18.Entity.*;
import sut.se.g18.Repository.*;

import java.util.stream.Stream;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	@Bean
	ApplicationRunner init(ContractRepository contractRepository, CompanyRepository companyRepository,
						   MaidSelectRepository maidSelectRepository, PromotionRepository promotionRepository,
						   CustomerRepository customerRepository, AdminAccountRepository adminAccountRepository,
						   ContractTypeRepository contractTypeRepository, PaymentStatusRepository paymentStatusRepository,
						   MaidStatusRepository maidStatusRepository,MaidRegisterRepository maidRegisterRepository, TitleNameRepository titleNameRepository,
						   TypeworkingRepository typeworkingRepository, WorkingDateRepositoy workingDateRepositoy){
		return args -> {

			Stream.of("นาง","นางสาว","นาย").forEach(title ->{

				if(title.equals("นาง")){
					TitleNameEntity titleNameEntityEntity = new TitleNameEntity();
					titleNameEntityEntity.setTitlenameType("นาง");
					titleNameRepository.save(titleNameEntityEntity);
				}

				if(title.equals("นางสาว")){
					TitleNameEntity titleNameEntityEntity = new TitleNameEntity();
					titleNameEntityEntity.setTitlenameType("นางสาว");
					titleNameRepository.save(titleNameEntityEntity);
				}

				if(title.equals("นาย")){
					TitleNameEntity titleNameEntityEntity = new TitleNameEntity();
					titleNameEntityEntity.setTitlenameType("นาย");
					titleNameRepository.save(titleNameEntityEntity);
				}

			});

			Stream.of("แม่บ้าน","แม่บ้านดูแลเด็ก","แม่บ้านดูแลเผู้สูงอายุ","คนดูแดสวน","คนขับรถ").forEach(typeworking ->{
				if(typeworking.equals("แม่บ้าน")){
					TypeworkingEntity typeworkingEntityEntity = new TypeworkingEntity();
					typeworkingEntityEntity.setTypeworking("แม่บ้าน");
					typeworkingRepository.save(typeworkingEntityEntity);
				}
				if(typeworking.equals("แม่บ้านดูแลเด็ก")){
					TypeworkingEntity typeworkingEntityEntity = new TypeworkingEntity();
					typeworkingEntityEntity.setTypeworking("แม่บ้านดูแลเด็ก");
					typeworkingRepository.save(typeworkingEntityEntity);
				}
				if(typeworking.equals("แม่บ้านดูแลเผู้สูงอายุ")){
					TypeworkingEntity typeworkingEntityEntity = new TypeworkingEntity();
					typeworkingEntityEntity.setTypeworking("แม่บ้านดูแลผู้สูงอายุ");
					typeworkingRepository.save(typeworkingEntityEntity);
				}
				if(typeworking.equals("คนดูแดสวน")){
					TypeworkingEntity typeworkingEntityEntity = new TypeworkingEntity();
					typeworkingEntityEntity.setTypeworking("คนดูแดสวน");
					typeworkingRepository.save(typeworkingEntityEntity);
				}
				if(typeworking.equals("คนขับรถ")){
					TypeworkingEntity typeworkingEntityEntity = new TypeworkingEntity();
					typeworkingEntityEntity.setTypeworking("คนขับรถ");
					typeworkingRepository.save(typeworkingEntityEntity);
				}
			});

			Stream.of("ทำงานแบบรายวัน","ทำงานแบบรายสัปดาห์","ทำงานแบบรายเดือน","ทำงานแบบรายปี").forEach(workingDate ->{
				if(workingDate.equals("ทำงานแบบรายวัน")){
					WorkingDateEntity workingDateEntityEntity = new WorkingDateEntity();
					workingDateEntityEntity.setTypeworkingDate("ทำงานแบบรายวัน");
					workingDateRepositoy.save(workingDateEntityEntity);
				}
				if(workingDate.equals("ทำงานแบบรายสัปดาห์")){
					WorkingDateEntity workingDateEntityEntity = new WorkingDateEntity();
					workingDateEntityEntity.setTypeworkingDate("ทำงานแบบรายสัปดาห์");
					workingDateRepositoy.save(workingDateEntityEntity);
				}
				if(workingDate.equals("ทำงานแบบรายเดือน")){
					WorkingDateEntity workingDateEntityEntity = new WorkingDateEntity();
					workingDateEntityEntity.setTypeworkingDate("ทำงานแบบรายเดือน");
					workingDateRepositoy.save(workingDateEntityEntity);
				}
				if(workingDate.equals("ทำงานแบบรายปี")){
					WorkingDateEntity workingDateEntityEntity = new WorkingDateEntity();
					workingDateEntityEntity.setTypeworkingDate("ทำงานแบบรายปี");
					workingDateRepositoy.save(workingDateEntityEntity);
				}
			});

		    AdminAccountEntity admin = new AdminAccountEntity();
		    admin.setAdminUsername("1234");
		    admin.setAdminPassword("4321");
		    adminAccountRepository.save(admin);

		    PaymentStatusEntity s1 = new PaymentStatusEntity();
		    s1.setPaymentStatus("ค้างชำระ");
		    paymentStatusRepository.save(s1);
		    PaymentStatusEntity s2 = new PaymentStatusEntity();
		    s2.setPaymentStatus("จ่ายแล้ว");
		    paymentStatusRepository.save(s2);

		    MaidStatusEntity stat2 = new MaidStatusEntity();
		    stat2.setStatus("จอง");
		    maidStatusRepository.save(stat2);
		    MaidStatusEntity stat3 = new MaidStatusEntity();
		    stat3.setStatus("ทำสัญญาอยู่");
		    maidStatusRepository.save(stat3);

		    ContractTypeEntity type1 = new ContractTypeEntity();
		    type1.setContractType("1 Day");
		    contractTypeRepository.save(type1);
			ContractTypeEntity type2 = new ContractTypeEntity();
			type2.setContractType("1 Week");
			contractTypeRepository.save(type2);
			ContractTypeEntity type3 = new ContractTypeEntity();
			type3.setContractType("1 Month");
			contractTypeRepository.save(type3);
			ContractTypeEntity type4 = new ContractTypeEntity();
			type4.setContractType("6 Months");
			contractTypeRepository.save(type4);
			ContractTypeEntity type5 = new ContractTypeEntity();
			type5.setContractType("1 Year");
			contractTypeRepository.save(type5);

			CustomerEntity cus = new CustomerEntity();
			cus.setCustomerName("Pitchayut CheeseJa");
			customerRepository.save(cus);

		    CompanyEntity c1 = new CompanyEntity();
		    c1.setCompanyName("พีกาซัส");
		    companyRepository.save(c1);
			CompanyEntity c2 = new CompanyEntity();
			c2.setCompanyName("โอซาก้า");
			companyRepository.save(c2);
			CompanyEntity c3 = new CompanyEntity();
			c3.setCompanyName("กินซ่า");
			companyRepository.save(c3);
			CompanyEntity c4 = new CompanyEntity();
			c4.setCompanyName("สวนรักษ์");
			companyRepository.save(c4);

			MaidRegisterEntity mm1 = new MaidRegisterEntity();
			CompanyEntity com = companyRepository.findBycompanyName("พีกาซัส");
			CompanyEntity com2 = companyRepository.findBycompanyName("โอซาก้า");
			CompanyEntity com3 = companyRepository.findBycompanyName("กินซ่า");
			CompanyEntity com4 = companyRepository.findBycompanyName("สวนรักษ์");
			mm1.setCompanyForMaid(com);
			mm1.setMaidName("Ping Kasinan");
			mm1.setMaidPhone("0935395533");
			maidRegisterRepository.save(mm1);
			MaidRegisterEntity mm2 = new MaidRegisterEntity();
			mm2.setMaidName("Ball Donlawat");
			mm2.setMaidPhone("0935395544");
			mm2.setCompanyForMaid(com2);
			maidRegisterRepository.save(mm2);
			MaidRegisterEntity mm3 = new MaidRegisterEntity();
			mm3.setMaidName("Yongyut Srisuban");
			mm3.setMaidPhone("0935395555");
			mm3.setCompanyForMaid(com);
			maidRegisterRepository.save(mm3);
			MaidRegisterEntity mm4 = new MaidRegisterEntity();
			mm4.setMaidName("Nanthika Poonpin");
			mm4.setMaidPhone("0935395566");
			mm4.setCompanyForMaid(com3);
			maidRegisterRepository.save(mm4);
			MaidRegisterEntity mm5 = new MaidRegisterEntity();
			mm5.setMaidName("Ploy Sumitra");
			mm5.setMaidPhone("0935395577");
			mm5.setCompanyForMaid(com4);
			maidRegisterRepository.save(mm5);

			MaidSelectEntity m1 = new MaidSelectEntity();
			CustomerEntity customer = customerRepository.findBycustomerName("Pitchayut CheeseJa");
			m1.setCustomer(customer);
			MaidRegisterEntity maid1 = maidRegisterRepository.findBymaidName("Ping Kasinan");
			m1.setMaid(maid1);
			MaidStatusEntity statusMaid = maidStatusRepository.findBystatus("จอง");
			m1.setStatus(statusMaid);
			maidSelectRepository.save(m1);
			MaidSelectEntity m3 = new MaidSelectEntity();
			m3.setCustomer(customer);
			MaidRegisterEntity maid2 = maidRegisterRepository.findBymaidName("Ball Donlawat");
			m3.setMaid(maid2);
			m3.setStatus(statusMaid);
			maidSelectRepository.save(m3);
			MaidSelectEntity m2 = new MaidSelectEntity();
			m2.setCustomer(customer);
			MaidRegisterEntity maid3 = maidRegisterRepository.findBymaidName("Yongyut Srisuban");
			m2.setMaid(maid3);
			m2.setStatus(statusMaid);
			maidSelectRepository.save(m2);
			MaidSelectEntity m4 = new MaidSelectEntity();
			m4.setCustomer(customer);
			MaidRegisterEntity maid4 = maidRegisterRepository.findBymaidName("Nanthika Poonpin");
			m4.setMaid(maid4);
			m4.setStatus(statusMaid);
			maidSelectRepository.save(m4);
			MaidSelectEntity m5 = new MaidSelectEntity();
			m5.setCustomer(customer);
			MaidRegisterEntity maid5 = maidRegisterRepository.findBymaidName("Ploy Sumitra");
			m5.setMaid(maid5);
			m5.setStatus(statusMaid);
			maidSelectRepository.save(m5);

		    PromotionEntity p1 = new PromotionEntity();
		    p1.setTitle("Discount");
		    CompanyEntity company = companyRepository.findBycompanyName("พีกาซัส");
		    p1.setCompany(company);
		    promotionRepository.save(p1);
		};
	}
}
