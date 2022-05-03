using System.Diagnostics;
using System.Text;

namespace AbridorJanelas
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            //System.Diagnostics.Process.Start("microsoftedge.exe", "https://sei.tjrr.jus.br/sei/controlador.php?acao=procedimento_controlar&acao_origem=procedimento_controlar&infra_sistema=100000100&infra_unidade_atual=11300030&infra_hash=c92f1452a6f62752786581130532c21534d77af94d7723650bbefc872e35fe3c");
            string nameWindow;
            
            ProcessStartInfo app = new ProcessStartInfo("microsoftedge.exe");
            app.WindowStyle = ProcessWindowStyle.Maximized;
            app.Arguments = @"https://sei.tjrr.jus.br/sei/controlador.php?acao=procedimento_controlar&acao_origem=procedimento_controlar&infra_sistema=100000100&infra_unidade_atual=11300030&infra_hash=c92f1452a6f62752786581130532c21534d77af94d7723650bbefc872e35fe3c";
            Process.Start(app);
        }

        private void button2_Click(object sender, EventArgs e)
        {
            Dispose();
        }

        private void lblInsertWindow_Click(object sender, EventArgs e)
        {

        }

        private void panel1_Paint(object sender, PaintEventArgs e)
        {

        }

        private void button4_Click(object sender, EventArgs e)
        {
            txtWinName1.Text = "";
        }

        private void trackBar1_Scroll(object sender, EventArgs e)
        {
            DefineValue();
        }

        private void DefineValue()
        {
            String num = trackBar1.Value.ToString();
            num.Substring(0, num.Length - 1);
            Convert.ToInt16(num);
        }

        private void Form1_Load(object sender, EventArgs e)
        {
            TrackBarSettings();
        }

        private void TrackBarSettings()
        {
            trackBar1.Minimum = 5;
            trackBar1.Maximum = 60;

            lbl5s.Text = "5s";
            lbl10s.Text = "10s";
            lbl15s.Text = "15s";
            lbl20s.Text = "20s";
            lbl25s.Text = "25s";
            lbl30s.Text = "30s";
            lbl35s.Text = "35s";
            lbl40s.Text = "40s";
            lbl45s.Text = "45s";
            lbl50s.Text = "50s";
            lbl55s.Text = "55s";
            lbl60s.Text = "60s";
        }
    }
}