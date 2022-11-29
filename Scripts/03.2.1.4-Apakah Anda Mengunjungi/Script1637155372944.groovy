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

not_run: WebUI.callTestCase(findTestCase('03.2.1.3-Apakah Nasabah Tertarik'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/04.Apakah Anda Mengunjungi/Back_Apakah Anda Akan Mengunjungi'), 
    0)

WebUI.verifyElementPresent(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/04.Apakah Anda Mengunjungi/Text_Apakah Anda Akan Mengunjungi'), 
    0)

WebUI.verifyElementPresent(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/04.Apakah Anda Mengunjungi/Text_Nama Apakah Anda Akan Mengunjungi'), 
    0)

WebUI.verifyElementPresent(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/04.Apakah Anda Mengunjungi/Text_NoHp Apakah Anda Akan Mengunjungi'), 
    0)

WebUI.verifyElementPresent(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/04.Apakah Anda Mengunjungi/RadioButton_Saya Akan Mengunjungi'), 
    0)

WebUI.verifyElementPresent(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/04.Apakah Anda Mengunjungi/RadioButton_Tidak Akan Mengunjungi'), 
    0)

WebUI.verifyElementPresent(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/04.Apakah Anda Mengunjungi/Button_SIMPAN Tidak Aktif'), 
    0)

WebUI.click(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/04.Apakah Anda Mengunjungi/RadioButton_Saya Akan Mengunjungi'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/04.Apakah Anda Mengunjungi/Button_Pilih Tanggal Kunjungan'), 
    0)

WebUI.click(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/04.Apakah Anda Mengunjungi/Button_Pilih Tanggal Kunjungan'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/04.Apakah Anda Mengunjungi/Text_Pilih Tanggal Dikunjungi'), 
    0)

WebUI.verifyElementPresent(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/04.Apakah Anda Mengunjungi/Text_Bulan'), 
    0)

WebUI.verifyElementPresent(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/04.Apakah Anda Mengunjungi/Next_Bulan'), 
    0)

WebUI.verifyElementPresent(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/04.Apakah Anda Mengunjungi/Prev_Bulan'), 
    0)

WebUI.click(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/04.Apakah Anda Mengunjungi/Tanggal_30'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/04.Apakah Anda Mengunjungi/RadioButton_Tidak Akan Mengunjungi'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/04.Apakah Anda Mengunjungi/Textarea_Tidak Akan Mengunjung'), 
    0)

WebUI.setText(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/04.Apakah Anda Mengunjungi/Textarea_Tidak Akan Mengunjung'), 
    'Test')

WebUI.verifyElementPresent(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/04.Apakah Anda Mengunjungi/Button_SIMPAN Aktif'), 
    0)

WebUI.click(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/04.Apakah Anda Mengunjungi/Button_SIMPAN Aktif'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/04.Apakah Anda Mengunjungi/Text_Catatan Tindak Lanjut'), 
    0)

WebUI.verifyElementPresent(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/04.Apakah Anda Mengunjungi/Text_Apakah Anda Yakin'), 
    0)

WebUI.verifyElementPresent(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/04.Apakah Anda Mengunjungi/Button_Periksa Kembali'), 
    0)

WebUI.verifyElementPresent(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/04.Apakah Anda Mengunjungi/Button_Yakin'), 
    0)

WebUI.click(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/04.Apakah Anda Mengunjungi/Button_Periksa Kembali'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/04.Apakah Anda Mengunjungi/Back_Apakah Anda Akan Mengunjungi'), 
    0)

WebUI.click(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/04.Apakah Anda Mengunjungi/Button_SIMPAN Aktif'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/04.Apakah Anda Mengunjungi/Text_Catatan Tindak Lanjut'), 
    0)

WebUI.click(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/04.Apakah Anda Mengunjungi/Button_Yakin'), 
    FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.verifyElementPresent(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/04.Apakah Anda Mengunjungi/Span_Catatan tindak lanjut berhasil'), 
    0)

not_run: WebUI.verifyElementPresent(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/04.Apakah Anda Mengunjungi/Span_Catatan tindak lanjut berhasil'), 
    0)

WebUI.verifyElementPresent(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/04.Apakah Anda Mengunjungi/Text_Detail Nasabah'), 
    0)

WebUI.click(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/04.Apakah Anda Mengunjungi/Button_Back Detail Nasabah'))

WebUI.verifyElementPresent(findTestObject('Nasabah Bridaya Page/Text_Nasabah BRIDaya'), 0)

WebUI.delay(2)

WebUI.click(findTestObject('Nasabah Bridaya Page/Button_Back Nasabah Bridaya Page'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('03.Home Page/Text_Selamat Datang,'), 0)

WebUI.delay(5)

