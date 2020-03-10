package com.kmh.spring.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountryUtils {

	private static volatile CountryUtils instance;

	private CountryUtils() {
	}

	public static CountryUtils getInstance() {
		if (null == instance) {
			synchronized (CountryUtils.class) {
				if (null == instance) {
					instance = new CountryUtils();
				}
			}
		}
		return instance;
	}

	public List<String> doAutoComplete(String input) {
		Map<String, String> map = getCountries();
		// // @formatter:off
		Map<String, String> collect = map.entrySet().stream().filter(
					x -> 	x.getKey().toLowerCase().contains(input.toLowerCase())
						|| 	x.getValue().toLowerCase().contains(input.toLowerCase())
				).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		// @formatter:on
		List<String> list = new ArrayList<String>();
		collect.forEach((k, v) -> list.add(String.join(" ", v, k)));
		System.out.println("************************************************");
		list.forEach(System.out::println);
		System.out.println("************************************************");
		return list;
	}

	private Map<String, String> getCountries() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("Afghanistan", "Kabul");
		map.put("Albania", "Tirana");
		map.put("Algeria", "Algiers");
		map.put("Andorra", "Andorra la Vella");
		map.put("Angola", "Luanda");
		map.put("Antigua and Barbuda", "Saint John's");
		map.put("Argentina", "Buenos Aires");
		map.put("Armenia", "Yerevan");
		map.put("Australia", "Canberra");
		map.put("Austria", "Vienna");
		map.put("Azerbaijan", "Baku");
		map.put("The Bahamas", "Nassau");
		map.put("Bahrain", "Manama");
		map.put("Bangladesh", "Dhaka");
		map.put("Barbados", "Bridgetown");
		map.put("Belarus", "Minsk");
		map.put("Belgium", "Brussels");
		map.put("Belize", "Belmopan");
		map.put("Benin", "Porto-Novo");
		map.put("Bhutan", "Thimphu");
		map.put("Bolivia", "La Paz");
		map.put("Bosnia and Herzegovina", "Sarajevo");
		map.put("Botswana", "Gaborone");
		map.put("Brazil", "Brasilia");
		map.put("Brunei", "Bandar Seri Begawan");
		map.put("Bulgaria", "Sofia");
		map.put("Burkina Faso", "Ouagadougou");
		map.put("Burundi", "Gitega");
		map.put("Cambodia", "Phnom Penh");
		map.put("Cameroon", "Yaounde");
		map.put("Canada", "Ottawa");
		map.put("Cape Verde", "Praia");
		map.put("Central African Republic", "Bangui");
		map.put("Chad", "N'Djamena");
		map.put("Chile", "Santiago");
		map.put("China", "Beijing");
		map.put("Colombia", "Bogota");
		map.put("Comoros", "Moroni");
		map.put("Congo,Republic of the", "Brazzaville");
		map.put("Congo,Democratic Republic of the", "Kinshasa");
		map.put("Costa Rica", "San Jose");
		map.put("Cote d'Ivoire", "Yamoussoukro");
		map.put("Croatia", "Zagreb");
		map.put("Cuba", "Havana");
		map.put("Cyprus", "Nicosia");
		map.put("Czech Republic", "Prague");
		map.put("Denmark", "Copenhagen");
		map.put("Djibouti", "Djibouti");
		map.put("Dominica", "Roseau");
		map.put("Dominican Republic", "Santo Domingo");
		map.put("East Timor (Timor-Leste)", "Dili");
		map.put("Ecuador", "Quito");
		map.put("Egypt", "Cairo");
		map.put("El Salvador", "San Salvador");
		map.put("Equatorial Guinea", "Malabo");
		map.put("Eritrea", "Asmara");
		map.put("Estonia", "Tallinn");
		map.put("Ethiopia", "Addis Ababa");
		map.put("Fiji", "Suva");
		map.put("Finland", "Helsinki");
		map.put("France", "Paris");
		map.put("Gabon", "Libreville");
		map.put("The Gambia", "Banjul");
		map.put("Georgia", "Tbilisi");
		map.put("Germany", "Berlin");
		map.put("Ghana", "Accra");
		map.put("Greece", "Athens");
		map.put("Grenada", "Saint George's");
		map.put("Guatemala", "Guatemala City");
		map.put("Guinea", "Conakry");
		map.put("Guinea-Bissau", "Bissau");
		map.put("Guyana", "Georgetown");
		map.put("Haiti", "Port-au-Prince");
		map.put("Honduras", "Tegucigalpa");
		map.put("Hungary", "Budapest");
		map.put("Iceland", "Reykjavik");
		map.put("India", "New Delhi");
		map.put("Indonesia", "Jakarta");
		map.put("Iran", "Tehran");
		map.put("Iraq", "Baghdad");
		map.put("Ireland", "Dublin");
		map.put("Israel", "Jerusalem*");
		map.put("Italy", "Rome");
		map.put("Jamaica", "Kingston");
		map.put("Japan", "Tokyo");
		map.put("Jordan", "Amman");
		map.put("Kazakhstan", "Astana");
		map.put("Kenya", "Nairobi");
		map.put("Kiribati", "Tarawa Atoll");
		map.put("Korea,North", "Pyongyang");
		map.put("Korea,South", "Seoul");
		map.put("Kosovo", "Pristina");
		map.put("Kuwait", "Kuwait City");
		map.put("Kyrgyzstan", "Bishkek");
		map.put("Laos", "Vientiane");
		map.put("Latvia", "Riga");
		map.put("Lebanon", "Beirut");
		map.put("Lesotho", "Maseru");
		map.put("Liberia", "Monrovia");
		map.put("Libya", "Tripoli");
		map.put("Liechtenstein", "Vaduz");
		map.put("Lithuania", "Vilnius");
		map.put("Luxembourg", "Luxembourg");
		map.put("Macedonia", "Skopje");
		map.put("Madagascar", "Antananarivo");
		map.put("Malawi", "Lilongwe");
		map.put("Malaysia", "Kuala Lumpur");
		map.put("Maldives", "Male");
		map.put("Mali", "Bamako");
		map.put("Malta", "Valletta");
		map.put("Marshall Islands", "Majuro");
		map.put("Mauritania", "Nouakchott");
		map.put("Mauritius", "Port Louis");
		map.put("Mexico", "Mexico City");
		map.put("Micronesia,Federated States of", "Palikir");
		map.put("Moldova", "Chisinau");
		map.put("Monaco", "Monaco");
		map.put("Mongolia", "Ulaanbaatar");
		map.put("Montenegro", "Podgorica");
		map.put("Morocco", "Rabat");
		map.put("Mozambique", "Maputo");
		map.put("Myanmar (Burma)", "Nay Pyi Taw");
		map.put("Namibia", "Windhoek");
		map.put("Nauru", "Yaren District");
		map.put("Nepal", "Kathmandu");
		map.put("Netherlands", "Amsterdam");
		map.put("New Zealand", "Wellington");
		map.put("Nicaragua", "Managua");
		map.put("Niger", "Niamey");
		map.put("Nigeria", "Abuja");
		map.put("Norway", "Oslo");
		map.put("Oman", "Muscat");
		map.put("Pakistan", "Islamabad");
		map.put("Palau", "Melekeok");
		map.put("Panama", "Panama City");
		map.put("Papua New Guinea", "Port Moresby");
		map.put("Paraguay", "Asuncion");
		map.put("Peru", "Lima");
		map.put("Philippines", "Manila");
		map.put("Poland", "Warsaw");
		map.put("Portugal", "Lisbon");
		map.put("Qatar", "Doha");
		map.put("Romania", "Bucharest");
		map.put("Russia", "Moscow");
		map.put("Rwanda", "Kigali");
		map.put("Saint Kitts and Nevis", "Basseterre");
		map.put("Saint Lucia", "Castries");
		map.put("Saint Vincent and the Grenadines", "Kingstown");
		map.put("Samoa", "Apia");
		map.put("San Marino", "San Marino");
		map.put("Sao Tome and Principe", "Sao Tome");
		map.put("Saudi Arabia", "Riyadh");
		map.put("Senegal", "Dakar");
		map.put("Serbia", "Belgrade");
		map.put("Seychelles", "Victoria");
		map.put("Sierra Leone", "Freetown");
		map.put("Singapore", "Singapore");
		map.put("Slovakia", "Bratislava");
		map.put("Slovenia", "Ljubljana");
		map.put("Solomon Islands", "Honiara");
		map.put("Somalia", "Mogadishu");
		map.put("South Africa", "Cape Town");
		map.put("South Sudan", "Juba ");
		map.put("Spain", "Madrid");
		map.put("Sri Lanka", "Colombo");
		map.put("Sudan", "Khartoum");
		map.put("Suriname", "Paramaribo");
		map.put("Swaziland", "Mbabane");
		map.put("Sweden", "Stockholm");
		map.put("Switzerland", "Bern");
		map.put("Syria", "Damascus");
		map.put("Taiwan", "Taipei");
		map.put("Tajikistan", "Dushanbe");
		map.put("Tanzania", "Dar es Salaam");
		map.put("Thailand", "Bangkok");
		map.put("Togo", "Lome");
		map.put("Tonga", "Nuku'alofa");
		map.put("Trinidad and Tobago", "Port-of-Spain");
		map.put("Tunisia", "Tunis");
		map.put("Turkey", "Ankara");
		map.put("Turkmenistan", "Ashgabat");
		map.put("Tuvalu", "Vaiaku village");
		map.put("Uganda", "Kampala");
		map.put("Ukraine", "Kyiv");
		map.put("United Arab Emirates", "Abu Dhabi");
		map.put("United Kingdom", "London");
		map.put("United States of America", "Washington,D.C.");
		map.put("Uruguay", "Montevideo");
		map.put("Uzbekistan", "Tashkent");
		map.put("Vanuatu", "Port-Vila");
		map.put("Vatican City (Holy See)", "Vatican City");
		map.put("Venezuela", "Caracas");
		map.put("Vietnam", "Hanoi");
		map.put("Yemen", "Sanaa");
		map.put("Zambia", "Lusaka");
		map.put("Zimbabwe", "Harare");
		return map;
	}
}