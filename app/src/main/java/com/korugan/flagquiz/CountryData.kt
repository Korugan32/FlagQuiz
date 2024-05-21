package com.korugan.flagquiz

data class Country(val name: String, val code: String)

val countries = listOf(
    Country(name = "Afghanistan", code = "AF"),
    Country(name = "Åland Islands", code = "AX"),
    Country(name = "Albania", code = "AL"),
    Country(name = "Algeria", code = "DZ"),
    Country(name = "American Samoa", code = "AS"),
    Country(name = "AndorrA", code = "AD"),
    Country(name = "Angola", code = "AO"),
    Country(name = "Anguilla", code = "AI"),
    Country(name = "Antarctica", code = "AQ"),
    Country(name = "Antigua and Barbuda", code = "AG"),
    Country(name = "Argentina", code = "AR"),
    Country(name = "Armenia", code = "AM"),
    Country(name = "Aruba", code = "AW"),
    Country(name = "Australia", code = "AU"),
    Country(name = "Austria", code = "AT"),
    Country(name = "Azerbaijan", code = "AZ"),
    Country(name = "Bahamas", code = "BS"),
    Country(name = "Bahrain", code = "BH"),
    Country(name = "Bangladesh", code = "BD"),
    Country(name = "Barbados", code = "BB"),
    Country(name = "Belarus", code = "BY"),
    Country(name = "Belgium", code = "BE"),
    Country(name = "Belize", code = "BZ"),
    Country(name = "Benin", code = "BJ"),
    Country(name = "Bermuda", code = "BM"),
    Country(name = "Bhutan", code = "BT"),
    Country(name = "Bolivia", code = "BO"),
    Country(name = "Bosnia and Herzegovina", code = "BA"),
    Country(name = "Botswana", code = "BW"),
    Country(name = "Bouvet Island", code = "BV"),
    Country(name = "Brazil", code = "BR"),
    Country(name = "British Indian Ocean Territory", code = "IO"),
    Country(name = "Brunei ", code = "BN"),
    Country(name = "Bulgaria", code = "BG"),
    Country(name = "Burkina Faso", code = "BF"),
    Country(name = "Burundi", code = "BI"),
    Country(name = "Cambodia", code = "KH"),
    Country(name = "Cameroon", code = "CM"),
    Country(name = "Canada", code = "CA"),
    Country(name = "Cape Verde", code = "CV"),
    Country(name = "Cayman Islands", code = "KY"),
    Country(name = "Central African Republic", code = "CF"),
    Country(name = "Chad", code = "TD"),
    Country(name = "Chile", code = "CL"),
    Country(name = "China", code = "CN"),
    Country(name = "Christmas Island", code = "CX"),
    Country(name = "Cocos Islands", code = "CC"),
    Country(name = "Colombia", code = "CO"),
    Country(name = "Comoros", code = "KM"),
    Country(name = "Congo", code = "CG"),
    Country(name = "Democratic Congo", code = "CD"),
    Country(name = "Cook Islands", code = "CK"),
    Country(name = "Costa Rica", code = "CR"),
    Country(name = "Cote D'Ivoire", code = "CI"),
    Country(name = "Croatia", code = "HR"),
    Country(name = "Cuba", code = "CU"),
    Country(name = "Cyprus", code = "CY"),
    Country(name = "Czech Republic", code = "CZ"),
    Country(name = "Denmark", code = "DK"),
    Country(name = "Djibouti", code = "DJ"),
    Country(name = "Dominica", code = "DM"),
    Country(name = "Dominican Republic", code = "DO"),
    Country(name = "Ecuador", code = "EC"),
    Country(name = "Egypt", code = "EG"),
    Country(name = "El Salvador", code = "SV"),
    Country(name = "Equatorial Guinea", code = "GQ"),
    Country(name = "Eritrea", code = "ER"),
    Country(name = "Estonia", code = "EE"),
    Country(name = "Ethiopia", code = "ET"),
    Country(name = "Falkland Islands", code = "FK"),
    Country(name = "Faroe Islands", code = "FO"),
    Country(name = "Fiji", code = "FJ"),
    Country(name = "Finland", code = "FI"),
    Country(name = "France", code = "FR"),
    Country(name = "French Guiana", code = "GF"),
    Country(name = "French Polynesia", code = "PF"),
    Country(name = "French Southern Territories", code = "TF"),
    Country(name = "Gabon", code = "GA"),
    Country(name = "Gambia", code = "GM"),
    Country(name = "Georgia", code = "GE"),
    Country(name = "Germany", code = "DE"),
    Country(name = "Ghana", code = "GH"),
    Country(name = "Gibraltar", code = "GI"),
    Country(name = "Greece", code = "GR"),
    Country(name = "Greenland", code = "GL"),
    Country(name = "Grenada", code = "GD"),
    Country(name = "Guadeloupe", code = "GP"),
    Country(name = "Guam", code = "GU"),
    Country(name = "Guatemala", code = "GT"),
    Country(name = "Guernsey", code = "GG"),
    Country(name = "Guinea", code = "GN"),
    Country(name = "Guinea-Bissau", code = "GW"),
    Country(name = "Guyana", code = "GY"),
    Country(name = "Haiti", code = "HT"),
    Country(name = "Heard Island and Mcdonald Islands", code = "HM"),
    Country(name = "Vatican City", code = "VA"),
    Country(name = "Honduras", code = "HN"),
    Country(name = "Hong Kong", code = "HK"),
    Country(name = "Hungary", code = "HU"),
    Country(name = "Iceland", code = "IS"),
    Country(name = "India", code = "IN"),
    Country(name = "Indonesia", code = "ID"),
    Country(name = "Iran", code = "IR"),
    Country(name = "Iraq", code = "IQ"),
    Country(name = "Ireland", code = "IE"),
    Country(name = "Isle of Man", code = "IM"),
    Country(name = "Israel", code = "IL"),
    Country(name = "Italy", code = "IT"),
    Country(name = "Jamaica", code = "JM"),
    Country(name = "Japan", code = "JP"),
    Country(name = "Jersey", code = "JE"),
    Country(name = "Jordan", code = "JO"),
    Country(name = "Kazakhstan", code = "KZ"),
    Country(name = "Kenya", code = "KE"),
    Country(name = "Kiribati", code = "KI"),
    Country(name = "North Korea", code = "KP"),
    Country(name = "South Korea", code = "KR"),
    Country(name = "Kuwait", code = "KW"),
    Country(name = "Kyrgyzstan", code = "KG"),
    Country(name = "Lao People'S Democratic Republic", code = "LA"),
    Country(name = "Latvia", code = "LV"),
    Country(name = "Lebanon", code = "LB"),
    Country(name = "Lesotho", code = "LS"),
    Country(name = "Liberia", code = "LR"),
    Country(name = "Libyan Arab Jamahiriya", code = "LY"),
    Country(name = "Liechtenstein", code = "LI"),
    Country(name = "Lithuania", code = "LT"),
    Country(name = "Luxembourg", code = "LU"),
    Country(name = "Macao", code = "MO"),
    Country(name = "Macedonia", code = "MK"),
    Country(name = "Madagascar", code = "MG"),
    Country(name = "Malawi", code = "MW"),
    Country(name = "Malaysia", code = "MY"),
    Country(name = "Maldives", code = "MV"),
    Country(name = "Mali", code = "ML"),
    Country(name = "Malta", code = "MT"),
    Country(name = "Marshall Islands", code = "MH"),
    Country(name = "Martinique", code = "MQ"),
    Country(name = "Mauritania", code = "MR"),
    Country(name = "Mauritius", code = "MU"),
    Country(name = "Mayotte", code = "YT"),
    Country(name = "Mexico", code = "MX"),
    Country(name = "Micronesia", code = "FM"),
    Country(name = "Moldova", code = "MD"),
    Country(name = "Monaco", code = "MC"),
    Country(name = "Mongolia", code = "MN"),
    Country(name = "Montserrat", code = "MS"),
    Country(name = "Morocco", code = "MA"),
    Country(name = "Mozambique", code = "MZ"),
    Country(name = "Myanmar", code = "MM"),
    Country(name = "Namibia", code = "NA"),
    Country(name = "Nauru", code = "NR"),
    Country(name = "Nepal", code = "NP"),
    Country(name = "Netherlands", code = "NL"),
    Country(name = "Netherlands Antilles", code = "AN"),
    Country(name = "New Caledonia", code = "NC"),
    Country(name = "New Zealand", code = "NZ"),
    Country(name = "Nicaragua", code = "NI"),
    Country(name = "Niger", code = "NE"),
    Country(name = "Nigeria", code = "NG"),
    Country(name = "Niue", code = "NU"),
    Country(name = "Norfolk Island", code = "NF"),
    Country(name = "Northern Mariana Islands", code = "MP"),
    Country(name = "Norway", code = "NO"),
    Country(name = "Oman", code = "OM"),
    Country(name = "Pakistan", code = "PK"),
    Country(name = "Palau", code = "PW"),
    Country(name = "Palestine", code = "PS"),
    Country(name = "Panama", code = "PA"),
    Country(name = "Papua New Guinea", code = "PG"),
    Country(name = "Paraguay", code = "PY"),
    Country(name = "Peru", code = "PE"),
    Country(name = "Philippines", code = "PH"),
    Country(name = "Pitcairn", code = "PN"),
    Country(name = "Poland", code = "PL"),
    Country(name = "Portugal", code = "PT"),
    Country(name = "Puerto Rico", code = "PR"),
    Country(name = "Qatar", code = "QA"),
    Country(name = "Reunion", code = "RE"),
    Country(name = "Romania", code = "RO"),
    Country(name = "Russian Federation", code = "RU"),
    Country(name = "RWANDA", code = "RW"),
    Country(name = "Saint Helena", code = "SH"),
    Country(name = "Saint Kitts and Nevis", code = "KN"),
    Country(name = "Saint Lucia", code = "LC"),
    Country(name = "Saint Pierre and Miquelon", code = "PM"),
    Country(name = "Saint Vincent and the Grenadines", code = "VC"),
    Country(name = "Samoa", code = "WS"),
    Country(name = "San Marino", code = "SM"),
    Country(name = "Sao Tome and Principe", code = "ST"),
    Country(name = "Saudi Arabia", code = "SA"),
    Country(name = "Senegal", code = "SN"),
    Country(name = "Serbia and Montenegro", code = "CS"),
    Country(name = "Seychelles", code = "SC"),
    Country(name = "Sierra Leone", code = "SL"),
    Country(name = "Singapore", code = "SG"),
    Country(name = "Slovakia", code = "SK"),
    Country(name = "Slovenia", code = "SI"),
    Country(name = "Solomon Islands", code = "SB"),
    Country(name = "Somalia", code = "SO"),
    Country(name = "South Africa", code = "ZA"),
    Country(name = "South Georgia and the South Sandwich Islands", code = "GS"),
    Country(name = "Spain", code = "ES"),
    Country(name = "Sri Lanka", code = "LK"),
    Country(name = "Sudan", code = "SD"),
    Country(name = "Suriname", code = "SR"),
    Country(name = "Svalbard and Jan Mayen", code = "SJ"),
    Country(name = "Swaziland", code = "SZ"),
    Country(name = "Sweden", code = "SE"),
    Country(name = "Switzerland", code = "CH"),
    Country(name = "Syrian Arab Republic", code = "SY"),
    Country(name = "Taiwan, Province of China", code = "TW"),
    Country(name = "Tajikistan", code = "TJ"),
    Country(name = "Tanzania, United Republic of", code = "TZ"),
    Country(name = "Thailand", code = "TH"),
    Country(name = "Timor-Leste", code = "TL"),
    Country(name = "Togo", code = "TG"),
    Country(name = "Tokelau", code = "TK"),
    Country(name = "Tonga", code = "TO"),
    Country(name = "Trinidad and Tobago", code = "TT"),
    Country(name = "Tunisia", code = "TN"),
    Country(name = "Turkey", code = "TR"),
    Country(name = "Turkmenistan", code = "TM"),
    Country(name = "Turks and Caicos Islands", code = "TC"),
    Country(name = "Tuvalu", code = "TV"),
    Country(name = "Uganda", code = "UG"),
    Country(name = "Ukraine", code = "UA"),
    Country(name = "United Arab Emirates", code = "AE"),
    Country(name = "United Kingdom", code = "GB"),
    Country(name = "United States", code = "US"),
    Country(name = "United States Minor Outlying Islands", code = "UM"),
    Country(name = "Uruguay", code = "UY"),
    Country(name = "Uzbekistan", code = "UZ"),
    Country(name = "Vanuatu", code = "VU"),
    Country(name = "Venezuela", code = "VE"),
    Country(name = "Viet Nam", code = "VN"),
    Country(name = "Virgin Islands, British", code = "VG"),
    Country(name = "Virgin Islands, U.S.", code = "VI"),
    Country(name = "Wallis and Futuna", code = "WF"),
    Country(name = "Western Sahara", code = "EH"),
    Country(name = "Yemen", code = "YE"),
    Country(name = "Zambia", code = "ZM"),
    Country(name = "Zimbabwe", code = "ZW")
)