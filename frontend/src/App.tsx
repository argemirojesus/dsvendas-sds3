import BarChart from "components/BarChart";
import DataTable from "components/DataTable";
import DonutChar from "components/DunetChart";
import Footer from "components/footer";
import Navbar from "components/Navbar";

function App() {
  return (
    <>
      <Navbar />
      <div className="container">
        <h1 className="text-primary py-3">Dashboard de Vendas</h1>

        <div className="row px-3">
          <div className="col-sm-6">
            <h5 className="text-center text-secondary">Performance de Sucesso</h5>
            <BarChart />
          </div>
          <div className="col-sm-6">
            <h5 className="text-center text-secondary">Todas as Vendas</h5>
            <DonutChar />
          </div>
        </div>

        <div className="py-3"></div>
        <h2 className="text-primary"> Total de Vendas por dia</h2>
        <DataTable />
      </div>
      <Footer />
    </>
  );
}

export default App;
