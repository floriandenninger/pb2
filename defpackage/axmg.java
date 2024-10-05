package defpackage;

import java.lang.reflect.Modifier;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axmg {
    protected static Logger a = Logger.getLogger(axmg.class.getName());
    protected static Map b = new HashMap();

    static {
        HashSet<Class> hashSet = new HashSet();
        hashSet.add(axma.class);
        hashSet.add(axmi.class);
        hashSet.add(axlx.class);
        hashSet.add(axmd.class);
        hashSet.add(axmf.class);
        hashSet.add(axmh.class);
        hashSet.add(axlw.class);
        hashSet.add(axme.class);
        hashSet.add(axmc.class);
        hashSet.add(axlz.class);
        for (Class cls : hashSet) {
            axmb axmbVar = (axmb) cls.getAnnotation(axmb.class);
            int[] b2 = axmbVar.b();
            int a2 = axmbVar.a();
            Map map = (Map) b.get(Integer.valueOf(a2));
            if (map == null) {
                map = new HashMap();
            }
            for (int i : b2) {
                map.put(Integer.valueOf(i), cls);
            }
            b.put(Integer.valueOf(a2), map);
        }
    }

    public static axlx a(int i, ByteBuffer byteBuffer) {
        axlx axmjVar;
        int aj = did.aj(byteBuffer);
        Map map = (Map) b.get(Integer.valueOf(i));
        if (map == null) {
            map = (Map) b.get(-1);
        }
        Class cls = (Class) map.get(Integer.valueOf(aj));
        if (cls == null || cls.isInterface() || Modifier.isAbstract(cls.getModifiers())) {
            Logger logger = a;
            Level level = Level.WARNING;
            String hexString = Integer.toHexString(i);
            String hexString2 = Integer.toHexString(aj);
            String valueOf = String.valueOf(cls);
            int length = String.valueOf(hexString).length();
            StringBuilder sb = new StringBuilder(length + 68 + String.valueOf(hexString2).length() + String.valueOf(valueOf).length());
            sb.append("No ObjectDescriptor found for objectTypeIndication ");
            sb.append(hexString);
            sb.append(" and tag ");
            sb.append(hexString2);
            sb.append(" found: ");
            sb.append(valueOf);
            logger.logp(level, "com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ObjectDescriptorFactory", "createFrom", sb.toString());
            axmjVar = new axmj();
        } else {
            try {
                axmjVar = (axlx) cls.newInstance();
            } catch (Exception e) {
                Logger logger2 = a;
                Level level2 = Level.SEVERE;
                String valueOf2 = String.valueOf(cls);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 99);
                sb2.append("Couldn't instantiate BaseDescriptor class ");
                sb2.append(valueOf2);
                sb2.append(" for objectTypeIndication ");
                sb2.append(i);
                sb2.append(" and tag ");
                sb2.append(aj);
                logger2.logp(level2, "com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ObjectDescriptorFactory", "createFrom", sb2.toString(), (Throwable) e);
                throw new RuntimeException(e);
            }
        }
        axmjVar.T = aj;
        int aj2 = did.aj(byteBuffer);
        axmjVar.U = aj2 & 127;
        int i2 = 1;
        while ((aj2 >>> 7) == 1) {
            aj2 = did.aj(byteBuffer);
            i2++;
            axmjVar.U = (axmjVar.U << 7) | (aj2 & 127);
        }
        axmjVar.V = i2;
        ByteBuffer slice = byteBuffer.slice();
        slice.limit(axmjVar.U);
        axmjVar.a(slice);
        byteBuffer.position(byteBuffer.position() + axmjVar.U);
        return axmjVar;
    }
}
