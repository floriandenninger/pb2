package defpackage;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alrr {
    private static final ammr c = new ammr("LocalTestingConfigParser", (char[]) null);
    public final XmlPullParser a;
    public final alrn b = alro.a();

    public alrr(XmlPullParser xmlPullParser) {
        this.a = xmlPullParser;
    }

    public static alro a(File file) {
        File file2 = new File(file, "local_testing_config.xml");
        if (!file2.exists()) {
            return alro.a;
        }
        try {
            FileReader fileReader = new FileReader(file2);
            try {
                XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
                newPullParser.setInput(fileReader);
                alrr alrrVar = new alrr(newPullParser);
                alrrVar.b("local-testing-config", new alrp(alrrVar, 1));
                alro a = alrrVar.b.a();
                fileReader.close();
                return a;
            } catch (Throwable th) {
                try {
                    fileReader.close();
                } catch (Throwable unused) {
                }
                throw th;
            }
        } catch (IOException | RuntimeException | XmlPullParserException e) {
            c.m("%s can not be parsed, using default. Error: %s", "local_testing_config.xml", e.getMessage());
            return alro.a;
        }
    }

    public final void b(String str, alrq alrqVar) {
        while (true) {
            int next = this.a.next();
            if (next == 3 || next == 1) {
                return;
            }
            if (this.a.getEventType() == 2) {
                if (this.a.getName().equals(str)) {
                    alrqVar.a();
                } else {
                    throw new XmlPullParserException(String.format("Expected '%s' tag but found '%s'.", str, this.a.getName()), this.a, null);
                }
            }
        }
    }
}
