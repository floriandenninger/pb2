package defpackage;

import java.io.IOException;
import java.text.AttributedCharacterIterator;
import java.text.Format;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class g {
    public final Appendable a;
    public int b;
    public List c = null;

    public g(StringBuffer stringBuffer) {
        this.a = stringBuffer;
        this.b = stringBuffer.length();
    }

    public final void b(Format format, Object obj) {
        if (this.c == null) {
            a(format.format(obj));
            return;
        }
        AttributedCharacterIterator formatToCharacterIterator = format.formatToCharacterIterator(obj);
        int i = this.b;
        Appendable appendable = this.a;
        try {
            int beginIndex = formatToCharacterIterator.getBeginIndex();
            int endIndex = formatToCharacterIterator.getEndIndex();
            int i2 = endIndex - beginIndex;
            if (beginIndex < endIndex) {
                appendable.append(formatToCharacterIterator.first());
                while (true) {
                    beginIndex++;
                    if (beginIndex >= endIndex) {
                        break;
                    } else {
                        appendable.append(formatToCharacterIterator.next());
                    }
                }
            }
            this.b = i2 + i;
            formatToCharacterIterator.first();
            int index = formatToCharacterIterator.getIndex();
            int endIndex2 = formatToCharacterIterator.getEndIndex();
            int i3 = i - index;
            while (index < endIndex2) {
                Map<AttributedCharacterIterator.Attribute, Object> attributes = formatToCharacterIterator.getAttributes();
                int runLimit = formatToCharacterIterator.getRunLimit();
                if (attributes.size() != 0) {
                    for (Map.Entry<AttributedCharacterIterator.Attribute, Object> entry : attributes.entrySet()) {
                        this.c.add(new h(entry.getKey(), entry.getValue(), i3 + index, i3 + runLimit));
                    }
                }
                formatToCharacterIterator.setIndex(runLimit);
                index = runLimit;
            }
        } catch (IOException e) {
            throw new ad(e);
        }
    }

    public g(StringBuilder sb) {
        this.a = sb;
        this.b = sb.length();
    }

    public final void c(Format format, Object obj, String str) {
        if (this.c != null || str == null) {
            b(format, obj);
        } else {
            a(str);
        }
    }

    public final void a(CharSequence charSequence) {
        try {
            this.a.append(charSequence);
            this.b += charSequence.length();
        } catch (IOException e) {
            throw new ad(e);
        }
    }
}
