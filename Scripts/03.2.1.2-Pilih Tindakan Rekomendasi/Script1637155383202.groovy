import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

not_run: WebUI.callTestCase(findTestCase('03.2.1.1-Lihat Detail Rekomendasi'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/02.Silahkan Pilih Tidakan/Text_Silakan pilih tindakan Anda'), 
    0)

WebUI.verifyElementPresent(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/02.Silahkan Pilih Tidakan/Text_Nama Input'), 
    0)

WebUI.verifyElementPresent(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/02.Silahkan Pilih Tidakan/Text_NoHP Input'), 
    0)

WebUI.verifyElementPresent(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/02.Silahkan Pilih Tidakan/Button_Hubungi Input'), 
    0)

WebUI.verifyElementPresent(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/02.Silahkan Pilih Tidakan/RadioButton_Sudah Dihubungi'), 
    0)

WebUI.click(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/02.Silahkan Pilih Tidakan/RadioButton_Sudah Dihubungi'))

WebUI.verifyElementPresent(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/02.Silahkan Pilih Tidakan/Button_Calendar Sudah Dihubungi'), 
    0)

not_run: WebUI.click(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/02.Silahkan Pilih Tidakan/Button_Calendar Sudah Dihubungi'), 
    FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.verifyElementPresent(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/02.Silahkan Pilih Tidakan/Text_Pilih Tanggal Dihubungi'), 
    0)

not_run: WebUI.click(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/02.Silahkan Pilih Tidakan/Tanggal_1'))

WebUI.verifyElementPresent(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/02.Silahkan Pilih Tidakan/Dropdown_Tidak Dapat Dihubungi'), 
    0)

WebUI.click(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/02.Silahkan Pilih Tidakan/Dropdown_Tidak Dapat Dihubungi'))

WebUI.verifyElementPresent(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/02.Silahkan Pilih Tidakan/RadioButton_Nomor hp tidak aktif'), 
    0)

WebUI.verifyElementPresent(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/02.Silahkan Pilih Tidakan/RadioButton_Nomor hp tidak aktif'), 
    0)

WebUI.verifyElementPresent(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/02.Silahkan Pilih Tidakan/RadioButton_Tidak mengangkat telepon'), 
    0)

WebUI.verifyElementPresent(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/02.Silahkan Pilih Tidakan/RadioButton_Pindah rumah atau lokasi'), 
    0)

WebUI.verifyElementPresent(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/02.Silahkan Pilih Tidakan/RadioButton_Lainnya Tidak Dapat Dihubungi'), 
    0)

WebUI.verifyElementPresent(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/02.Silahkan Pilih Tidakan/Textarea_Lainnya Tidak Dapat Dihubungi'), 
    0)

WebUI.verifyElementPresent(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/02.Silahkan Pilih Tidakan/Dropdown_Tidak Cocok'), 
    0)

WebUI.click(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/02.Silahkan Pilih Tidakan/Dropdown_Tidak Cocok'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/02.Silahkan Pilih Tidakan/RadioButton_Karakter buruk'), 
    0)

WebUI.verifyElementPresent(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/02.Silahkan Pilih Tidakan/RadioButton_Sakit'), 
    0)

WebUI.verifyElementPresent(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/02.Silahkan Pilih Tidakan/RadioButton_Tidak bisa meninggalkan tempat usaha'), 
    0)

WebUI.verifyElementPresent(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/02.Silahkan Pilih Tidakan/RadioButton_Tidak memiliki usahabangkrut'), 
    0)

WebUI.verifyElementPresent(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/02.Silahkan Pilih Tidakan/RadioButton_Lainnya Tidak Cocok'), 
    0)

WebUI.verifyElementPresent(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/02.Silahkan Pilih Tidakan/Textarea_Lainnya Tidak Cocok'), 
    0)

WebUI.verifyElementPresent(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/02.Silahkan Pilih Tidakan/Button_SELANJUTNYA Tidak Aktif'), 
    0)

WebUI.click(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/02.Silahkan Pilih Tidakan/RadioButton_Sudah Dihubungi'))

WebUI.delay(2)

WebUI.click(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/02.Silahkan Pilih Tidakan/Dropdown_Tidak Dapat Dihubungi'))

WebUI.delay(2)

WebUI.click(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/02.Silahkan Pilih Tidakan/RadioButton_Nomor hp tidak aktif'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/02.Silahkan Pilih Tidakan/RadioButton_Nomor hp tidak aktif'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/02.Silahkan Pilih Tidakan/RadioButton_Tidak mengangkat telepon'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/02.Silahkan Pilih Tidakan/RadioButton_Pindah rumah atau lokasi'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/02.Silahkan Pilih Tidakan/RadioButton_Lainnya Tidak Dapat Dihubungi'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/02.Silahkan Pilih Tidakan/Textarea_Lainnya Tidak Dapat Dihubungi'), 
    'Test')

WebUI.delay(2)

WebUI.click(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/02.Silahkan Pilih Tidakan/Dropdown_Tidak Cocok'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/02.Silahkan Pilih Tidakan/RadioButton_Karakter buruk'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/02.Silahkan Pilih Tidakan/RadioButton_Sakit'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/02.Silahkan Pilih Tidakan/RadioButton_Tidak bisa meninggalkan tempat usaha'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/02.Silahkan Pilih Tidakan/RadioButton_Tidak memiliki usahabangkrut'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/02.Silahkan Pilih Tidakan/RadioButton_Lainnya Tidak Cocok'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/02.Silahkan Pilih Tidakan/Textarea_Lainnya Tidak Cocok'), 
    'Test')

WebUI.delay(2)

WebUI.click(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/02.Silahkan Pilih Tidakan/RadioButton_Sudah Dihubungi'))

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/02.Silahkan Pilih Tidakan/Button_SELANJUTNYA Aktif Silahkan pilih tindakan'), 
    0)

WebUI.click(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/02.Silahkan Pilih Tidakan/Button_SELANJUTNYA Aktif Silahkan pilih tindakan'))

WebUI.delay(5)

