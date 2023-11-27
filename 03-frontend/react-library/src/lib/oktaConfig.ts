export const oktaConfig = {
    clientId: "0oadhwo3fvsOUPDdC5d7",
    issuer: "https://dev-54649776.okta.com/oauth2/default",
    redirectUri: "http://localhost:3000/login/callback",
    scopes: ["openid", "profile", "email"],
    pkce: true,
    disableHttpsCheck: true,
}