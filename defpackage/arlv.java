package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arlv extends aonm implements aooz {
    public static final arlv a;
    private static volatile aopf h;
    public int b;
    public arnb c;
    public String g;
    private byte i = 2;
    public String d = "";
    public String e = "";
    public String f = "";

    static {
        arlv arlvVar = new arlv();
        a = arlvVar;
        aonm.registerDefaultInstance(arlv.class, arlvVar);
    }

    private arlv() {
        aonm.emptyProtobufList();
        this.g = "";
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.i);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.i = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u000b\u0005\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဈ\u0002\u0003ဈ\u0001\u0004ဈ\u0003\u000bဈ\n", new Object[]{"b", "c", "e", "d", "f", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new arlv();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (arlv.class) {
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
