package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqyg extends aonh implements aoni {
    public static final aqyg a;
    private static volatile aopf g;
    public int b;
    public boolean e;
    public aqyh f;
    private byte h = 2;
    public aony c = emptyProtobufList();
    public String d = "";

    static {
        aqyg aqygVar = new aqyg();
        a = aqygVar;
        aonm.registerDefaultInstance(aqyg.class, aqygVar);
    }

    private aqyg() {
    }

    public final void a() {
        aony aonyVar = this.c;
        if (aonyVar.c()) {
            return;
        }
        this.c = aonm.mutableCopy(aonyVar);
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.h);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.h = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0001\u0001Л\u0002ဇ\u0001\u0003ဉ\u0002\u0004ဈ\u0000", new Object[]{"b", "c", aqyi.class, "e", "f", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new aqyg();
            case NEW_BUILDER:
                return new aong(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (aqyg.class) {
                        aopfVar = g;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            g = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
