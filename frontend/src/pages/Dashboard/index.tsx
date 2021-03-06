import BarChart from "components/BarChart";
import DataTable from "components/DataTable";
import DonutChar from "components/DonutChart";
import Footer from "components/footer";
import Navbar from "components/Navbar";

const Dashboard = () => {
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
        <h2 className="text-primary">Todas as Vendas</h2>
        <DataTable />
      </div>
      <Footer />
    </>
    );
}

export default Dashboard;