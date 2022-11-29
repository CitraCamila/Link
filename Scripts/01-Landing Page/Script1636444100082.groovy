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

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.Url)

WebUI.maximizeWindow()

WebUI.delay(5)

not_run: WebUI.verifyElementPresent(findTestObject('01.Landing Page/Logo_Bribrain Landing Page'), 0)

not_run: WebUI.verifyElementPresent(findTestObject('01.Landing Page/Span_BRIBRAIN berkomitmen untuk memberikan rekomendasi yang tepat sasaran bagi tenaga pemasar BRI'), 
    0)

not_run: WebUI.verifyElementPresent(findTestObject('01.Landing Page/Span_Capai kemudahan untuk setiap bidang kerja Anda'), 
    0)

not_run: WebUI.verifyElementPresent(findTestObject('01.Landing Page/Span_Tinjau manfaat BRIBRAIN untuk role yang Anda miliki'), 
    0)

not_run: WebUI.verifyElementPresent(findTestObject('01.Landing Page/Text_Tingkatkan produktivitas tenaga pemasar dengan BRIBRAIN'), 
    0)

not_run: WebUI.scrollToElement(findTestObject('01.Landing Page/Span_Situs Web Perusahaan'), 0)

not_run: WebUI.verifyElementPresent(findTestObject('01.Landing Page/Slide_1.Wujudkan target identifikasi'), 0)

not_run: WebUI.verifyElementPresent(findTestObject('01.Landing Page/Slide_2.Kantor Pusat'), 0)

not_run: WebUI.verifyElementPresent(findTestObject('01.Landing Page/Slide_3.Jangkau calon Agen BRILink'), 0)

not_run: WebUI.verifyElementPresent(findTestObject('01.Landing Page/Span_Situs Web Perusahaan'), 0)

not_run: WebUI.verifyElementPresent(findTestObject('01.Landing Page/Span_Link Situs Web BRI'), 0)

not_run: WebUI.verifyElementPresent(findTestObject('01.Landing Page/Span_Alamat'), 0)

not_run: WebUI.verifyElementPresent(findTestObject('01.Landing Page/Span_Jl. Jend. Sudirman No. Kav 44-46'), 0)

not_run: WebUI.scrollToElement(findTestObject('01.Landing Page/Text_Tingkatkan produktivitas tenaga pemasar dengan BRIBRAIN'), 
    0)

WebUI.click(findTestObject('01.Landing Page/Button Login New'))

not_run: WebUI.delay(5)

