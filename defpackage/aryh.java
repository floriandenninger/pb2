package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aryh extends aonm implements aooz {
    public static final aryh a;
    private static volatile aopf d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        aryh aryhVar = new aryh();
        a = aryhVar;
        aonm.registerDefaultInstance(aryh.class, aryhVar);
    }

    private aryh() {
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
                return newMessageInfo(a, "\u0001\t\u0001\u0000\uf364ᯓ\ue2df\ua7cb\t\u0000\u0000\b\uf364ᯓᐼ\u0000\uf321Ẑᐼ\u0000\ue80fỌᐼ\u0000\uf767≎ᐼ\u0000\ue94e⋬ᐼ\u0000\ue22b⤖ᐼ\u0000\uf811⮎ᐼ\u0000\uf2ec槅ြ\u0000\ue2df\ua7cbᐼ\u0000", new Object[]{"c", "b", atyq.class, aqdt.class, atyw.class, atyx.class, atyt.class, awhp.class, auaj.class, apom.class, atyp.class});
            case NEW_MUTABLE_INSTANCE:
                return new aryh();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (aryh.class) {
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
