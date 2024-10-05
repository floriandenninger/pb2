package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aryn extends aonm implements aooz {
    public static final aryn a;
    private static volatile aopf g;
    public int b;
    public atcf c;
    public awfm d;
    public avhy e;
    public apxi f;
    private byte h = 2;

    static {
        aryn arynVar = new aryn();
        a = arynVar;
        aonm.registerDefaultInstance(aryn.class, arynVar);
    }

    private aryn() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\uefcf⸵\ue60b囤\u0004\u0000\u0000\u0004\uefcf⸵ᐉ\u0000\uf23f㤑ᐉ\u0001\ueb41䣥ᐉ\u0002\ue60b囤ᐉ\u0003", new Object[]{"b", "c", "d", "e", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new aryn();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (aryn.class) {
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
