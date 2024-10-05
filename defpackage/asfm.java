package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asfm extends aonm implements aooz {
    public static final asfm a;
    private static volatile aopf l;
    public int b;
    public arnb c;
    public avit j;
    private byte m = 2;
    public String d = "";
    public String e = "";
    public String f = "";
    public String g = "";
    public aomf h = aomf.b;
    public aomf i = aomf.b;
    public aony k = emptyProtobufList();

    static {
        asfm asfmVar = new asfm();
        a = asfmVar;
        aonm.registerDefaultInstance(asfm.class, asfmVar);
    }

    private asfm() {
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
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\u000e\t\u0000\u0001\u0001\u0001ᐉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0006ည\u0005\u0007ည\u0006\bဈ\u0003\tဈ\u0004\rဉ\b\u000e\u001c", new Object[]{"b", "c", "d", "e", "h", "i", "f", "g", "j", "k"});
            case NEW_MUTABLE_INSTANCE:
                return new asfm();
            case NEW_BUILDER:
                return new aone((int[][]) null, (float[]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = l;
                if (aopfVar == null) {
                    synchronized (asfm.class) {
                        aopfVar = l;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            l = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
