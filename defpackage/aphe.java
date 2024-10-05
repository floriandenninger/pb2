package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aphe extends aonm implements aooz {
    public static final aphe a;
    private static volatile aopf d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        aphe apheVar = new aphe();
        a = apheVar;
        aonm.registerDefaultInstance(aphe.class, apheVar);
    }

    private aphe() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.e);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.e = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0007\u0001\u0000\uf143ᠤ\uf687㙱\u0007\u0000\u0000\u0007\uf143ᠤᐼ\u0000啕\u1cc9ᐼ\u0000\uf0d1⢇ᐼ\u0000ﵫ⫪ᐼ\u0000\ue0aeヾᐼ\u0000\ufe1f㔺ᐼ\u0000\uf687㙱ᐼ\u0000", new Object[]{"c", "b", aqdb.class, ardf.class, aphc.class, atwd.class, ataw.class, aphb.class, aphh.class});
            case NEW_MUTABLE_INSTANCE:
                return new aphe();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (aphe.class) {
                        aopfVar = d;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            d = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
