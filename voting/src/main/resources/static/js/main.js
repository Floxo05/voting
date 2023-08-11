
const alertMe = () => {
	alert("Hello World");
};

// alertMe();

const vote = () => {
	let url = "/result";
	
	let data = {
		vote: true
	}
	
	fetch(url, {
		method: 'POST',
		headers: {
			'Content-Type': 'application/json'
		},
		body: JSON.stringify(data)
	})
	.then(res => {
		console.log(res.json());
	})
}