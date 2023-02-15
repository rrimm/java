package test1;

import java.util.Scanner;

public class Dictionary extends PairMap {
	int num;

	public Dictionary(int num) {

		num = 0;
		keyArray = new String[num];
		valueArray = new String[num];
	}

	@Override
	String get(String key) { 	// key 값을 가진 value 리턴, 없으면 null 리턴
		for (int i = 0; i < num; i++) {
			if (keyArray[i].equals(key)) {
				return valueArray[i];
			}
		}
		return null;
	}

	@Override
	void put(String key, String value) { // key와 value를 쌍으로 저장. 기존에 key가 있으면, 값을 value로 수정
		for (int i = 0; i < num; i++) {
			if (keyArray[i].equals(key)) {
				valueArray[i] = value;
				return;
			}
		}

		valueArray[num] = value;
		keyArray[num++] = key;
		return;

	}

	@Override
	String delete(String key) { // key 값을 가진 아이템 (value와 함꼐) 삭제, 삭제된 value 값 리턴
		String deleteData = null;
		for (int i = 0; i < num; i++) {
			if (keyArray[i].equals(key)) {
				deleteData = valueArray[i];
				for (int j = i; j < num - 1; j++) {
					valueArray[j] = valueArray[j + 1];
					keyArray[j] = keyArray[j + 1];
				}
				num--;
			}
		}
		return deleteData;
	}

	@Override
	int length() { // 현재 저장된 아이템의 개수 리턴

		return num;
	}

}
