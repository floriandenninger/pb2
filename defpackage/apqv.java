package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class apqv extends aonm implements aooz {
    public static final apqv a;
    private static volatile aopf k;
    public int b;
    public Object d;
    public apqu f;
    public int h;
    public apxf i;
    private aota l;
    public int c = 0;
    private byte m = 2;
    public aony e = emptyProtobufList();
    public aomf g = aomf.b;
    public int j = 1;

    static {
        apqv apqvVar = new apqv();
        a = apqvVar;
        aonm.registerDefaultInstance(apqv.class, apqvVar);
    }

    private apqv() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.m);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.m = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\t\u0001\u0001\u0001\t\t\u0000\u0001\u0005\u0001Л\u0002ဉ\u0000\u0003ᐼ\u0000\u0004ᐉ\u0003\u0005ည\u0004\u0006ᐼ\u0000\u0007ဌ\u0005\bᐉ\u0006\tဌ\u0007", new Object[]{"d", "c", "b", "e", apqw.class, "f", apxf.class, "l", "g", apmh.class, "h", apqr.a, "i", "j", apqr.e});
            case NEW_MUTABLE_INSTANCE:
                return new apqv();
            case NEW_BUILDER:
                return new aone((boolean[][]) null, (int[][]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = k;
                if (aopfVar == null) {
                    synchronized (apqv.class) {
                        aopfVar = k;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            k = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
