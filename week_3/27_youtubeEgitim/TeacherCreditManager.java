
public class TeacherCreditManager extends BaseCreditManager  implements ICreditManager{
// BaseCreditManager ICreditManager dan implamente olduğu için sadece TeacherCreditManager extends BaseCreditManager yapmamız yeterli
	@Override
	public void calculate() {
		System.out.println("Öğretmen kredisi hesaplandı");
	}
	
	@Override
	public void save() {
		System.out.println("Öğretmen kredisi kaydedildi");
	}

}
