# Weather AI

## This is a demo on how you can use functions with Spring AI to call functions.

### Setup
#### In order to run the application a free account needs to be created on https://www.weatherapi.com/api-explorer.aspx and there you can receive your API key
#### Set the API keys in Edit Configurations as follows: 
`OPENAI_API_KEY=your-openai-api-key; WEATHER_API_KEY=your-weather-api-key`

#### You can make a get request to the endpoint like this `http://localhost:8080/cities?message="What is the current weather like in Tallinn?"`