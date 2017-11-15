var React = require("react");
var ReactDOMServer = require("react-dom/server");

function renderSomething() {
    return ReactDOMServer.renderToString(React.createElement("div", {}, "Hello world!"));
};

module.exports = {
    renderSomething: renderSomething
};
