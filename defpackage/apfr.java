package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class apfr extends aonm implements aooz {
    public static final apfr a;
    private static volatile aopf i;
    public boolean f;
    private int j;
    private byte k = 2;
    public String b = "";
    public String c = "";
    public String d = "";
    public String e = "";
    public aony g = emptyProtobufList();
    public aony h = emptyProtobufList();

    static {
        apfr apfrVar = new apfr();
        a = apfrVar;
        aonm.registerDefaultInstance(apfr.class, apfrVar);
    }

    private apfr() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.k);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.k = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0002\u0002\u0001ဈ\u0000\u0002ဈ\u0003\u0003ဈ\u0004\u0004ဈ\u0005\u0005ဇ\u0006\u0006Л\bЛ", new Object[]{"j", "b", "c", "d", "e", "f", "g", apxf.class, "h", apxf.class});
            case NEW_MUTABLE_INSTANCE:
                return new apfr();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = i;
                if (aopfVar == null) {
                    synchronized (apfr.class) {
                        aopfVar = i;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            i = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
