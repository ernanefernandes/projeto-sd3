import DataTable from "components/DataTable";
import Footer from "components/Footer";
import NavBar from "components/NavBar";

function App() {
  return (
    <>
      <NavBar />
      <div className="container">
        <h1> DS Vendas </h1>
      </div>
      <DataTable />
      <Footer />
    </>
  );
}

export default App;
