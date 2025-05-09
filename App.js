import React, { useEffect, useState } from 'react';
import axios from 'axios';

function App() {
  const [questions, setQuestions] = useState([]);

  useEffect(() => {
    axios.get('http://localhost:8080/api/questions')
      .then(res => setQuestions(res.data))
      .catch(err => console.error('Erreur:', err));
  }, []);

  return (
    <div style={{ padding: '20px' }}>
      <h1>Quiz One</h1>
      {questions.length > 0 ? (
        questions.map((q, index) => (
          <div key={index}>
            <h3>{q.text}</h3>
          </div>
        ))
      ) : (
        <p>Chajman kesyon yo...</p>
      )}
    </div>
  );
}

export default App;
