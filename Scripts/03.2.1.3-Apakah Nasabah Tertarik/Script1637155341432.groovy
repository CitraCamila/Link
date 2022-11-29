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

not_run: WebUI.callTestCase(findTestCase('03.2.1.2-Pilih Tindakan Rekomendasi'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/03.Apakah Nasabah Tertarik/Text_Apakah Nasabah Tertarik'), 
    0)

WebUI.verifyElementPresent(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/03.Apakah Nasabah Tertarik/Back_Apakah Nasabah Tertarik'), 
    0)

WebUI.verifyElementPresent(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/03.Apakah Nasabah Tertarik/Text_Nama Apakah Nasabah Tertarik'), 
    0)

WebUI.verifyElementPresent(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/03.Apakah Nasabah Tertarik/Text_Alamat Apakah Nasabah Tertarik'), 
    0)

WebUI.verifyElementPresent(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/03.Apakah Nasabah Tertarik/Dropdown_Tertarik'), 
    0)

WebUI.click(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/03.Apakah Nasabah Tertarik/Dropdown_Tertarik'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/03.Apakah Nasabah Tertarik/Checklist_Debitur masih memiliki kemampuan atau RPC'), 
    0)

WebUI.verifyElementPresent(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/03.Apakah Nasabah Tertarik/Checklist_Debitur mau melakukan pelunasan'), 
    0)

WebUI.verifyElementPresent(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/03.Apakah Nasabah Tertarik/Checklist_Debitur mau mengikuti pemberdayaan'), 
    0)

WebUI.verifyElementPresent(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/03.Apakah Nasabah Tertarik/Checklist_Debitur mau meningkatkan omzet'), 
    0)

WebUI.verifyElementPresent(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/03.Apakah Nasabah Tertarik/Checklist_Debitur ngin membangkitkan kembali usaha'), 
    0)

WebUI.verifyElementPresent(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/03.Apakah Nasabah Tertarik/RadioButton_Tidak Tertarik'), 
    0)

WebUI.click(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/03.Apakah Nasabah Tertarik/RadioButton_Tidak Tertarik'))

WebUI.verifyElementPresent(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/03.Apakah Nasabah Tertarik/Textarea_Tidak Tertarik'), 
    0)

WebUI.verifyElementPresent(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/03.Apakah Nasabah Tertarik/Button_SIMPAN Tidak Aktif'), 
    0)

WebUI.click(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/03.Apakah Nasabah Tertarik/Back_Apakah Nasabah Tertarik'))

WebUI.verifyElementPresent(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/02.Silahkan Pilih Tidakan/Text_Silakan pilih tindakan Anda'), 
    0)

WebUI.click(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/02.Silahkan Pilih Tidakan/Button_SELANJUTNYA Aktif'))

WebUI.delay(2)

WebUI.click(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/03.Apakah Nasabah Tertarik/Dropdown_Tertarik'))

WebUI.delay(1)

WebUI.click(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/03.Apakah Nasabah Tertarik/Checklist_Debitur masih memiliki kemampuan atau RPC'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.click(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/03.Apakah Nasabah Tertarik/Checklist_Debitur mau melakukan pelunasan'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.click(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/03.Apakah Nasabah Tertarik/Checklist_Debitur mau mengikuti pemberdayaan'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.click(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/03.Apakah Nasabah Tertarik/Checklist_Debitur mau meningkatkan omzet'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.click(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/03.Apakah Nasabah Tertarik/Checklist_Debitur ngin membangkitkan kembali usaha'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/03.Apakah Nasabah Tertarik/RadioButton_Tidak Tertarik'))

WebUI.setText(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/03.Apakah Nasabah Tertarik/Textarea_Tidak Tertarik'), 
    'Test')

WebUI.delay(2)

WebUI.click(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/03.Apakah Nasabah Tertarik/Dropdown_Tertarik'))

WebUI.delay(1)

WebUI.click(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/03.Apakah Nasabah Tertarik/Checklist_Debitur masih memiliki kemampuan atau RPC'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Nasabah Bridaya Page/01.Nasabah Bridaya-Rekomendasi/03.Apakah Nasabah Tertarik/Button_SELANJUTNYA Aktif'))

WebUI.delay(5)

