document.addEventListener('DOMContentLoaded', () => {
	console.log("dom content loaded");
	const loginForm = document.querySelector("#loginForm");

	const handleSubmit = async (e) => {
		e.preventDefault();

		const userId = loginForm.querySelector("#userId");
		const userPw = loginForm.querySelector("#userPw");

		// 아이디 or 패스워드 공백 처리
		if (userId.value === "") {
			alert("아이디를 입력해주세요.");
			return;
		} else if (userPw.value === "") {
			alert("비밀번호를 입력해주세요.");
			return;
		}

		console.log("submit");

		const url = "/api/user/login";
		const data = {
			userId: userId.value,
			userPw: userPw.value
		};

		console.log(data);

		// api 호출
		try {
			const response = await fetch(url, {
				method: "POST",
				body: JSON.stringify(data),
				headers: {
					'Content-Type': 'application/json'
				}
			})
			
			// status 200 : 로그인 성공
			if (response.status === 200) {
				const userInfo = await response.json();
				alert(`${userInfo.userName}, 로그인 성공`);
				userId.value = "";
				userPw.value = "";
				userPw.blur();
			}
			
			// status 401 : 로그인 실패
			else if (response.status === 401) {
				console.log("로그인 정보를 다시 확인해주세요.");
				alert("로그인 실패\n로그인정보를 다시 확인해주세요");
			} else {
				console.log("로그인 에러");
			}

		} catch (error) {
			console.log(error);
		}
	}

	loginForm.addEventListener("submit", handleSubmit);
})

