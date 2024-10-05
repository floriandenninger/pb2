package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arui extends aonm implements aooz {
    public static final arui a;
    private static volatile aopf f;
    public int b;
    public arnb c;
    public String d;
    public asox e;
    private byte g = 2;

    static {
        arui aruiVar = new arui();
        a = aruiVar;
        aonm.registerDefaultInstance(arui.class, aruiVar);
    }

    private arui() {
        aomf aomfVar = aomf.b;
        this.d = "";
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.g);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.g = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u000b\u0003\u0000\u0000\u0001\u0001ᐉ\u0000\u0004ဈ\u0002\u000bဉ\u0003", new Object[]{"b", "c", "d", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new arui();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (arui.class) {
                        aopfVar = f;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            f = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
