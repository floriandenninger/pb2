package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class apkf extends aonm implements aooz {
    public static final apkf a;
    private static volatile aopf h;
    public int b;
    public arfs d;
    public aqyg f;
    public apkg g;
    private aota i;
    private byte j = 2;
    public String c = "";
    public String e = "";

    static {
        apkf apkfVar = new apkf();
        a = apkfVar;
        aonm.registerDefaultInstance(apkf.class, apkfVar);
    }

    private apkf() {
        aomf aomfVar = aomf.b;
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.j);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.j = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0003\u0001ဈ\u0000\u0002ᐉ\u0003\u0003ဉ\u0004\u0004ᐉ\u0005\u0006ဈ\u0002\u0007ᐉ\u0001", new Object[]{"b", "c", "f", "g", "i", "e", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new apkf();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (apkf.class) {
                        aopfVar = h;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            h = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
