import axios from 'axios';

const http = axios.create({
    baseURL: "http://localhost:8080"
});

export default {
    getEmployee(id){
        return http.get(`/employee/${id}`);
    }
}