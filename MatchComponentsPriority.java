public static int prio(char op) {
	int resp = 0;
	swith (op) {
		case '(' : resp = 1; break;
		case '+' : resp = 2; break;
		case '-' : resp = 3; break;
		case '*' : resp = 4; break;
		case '/' : resp = 5; break;
	}
	return resp;
}