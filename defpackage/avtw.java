package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avtw extends aonm implements aooz {
    public static final avtw a;
    private static volatile aopf h;
    public int b;
    public aufk c;
    public avuh d;
    public avgc e;
    public avxz f;
    public avsp g;
    private avju i;
    private byte j = 2;

    static {
        avtw avtwVar = new avtw();
        a = avtwVar;
        aonm.registerDefaultInstance(avtw.class, avtwVar);
    }

    private avtw() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\uf5e2ẝ\uf088⩯\u0006\u0000\u0000\u0005\uf5e2ẝᐉ\u0001隷Ἥᐉ\u0005\uf862⏒ᐉ\u0006\uefe0▍ဉ\u0007\uedc2⡷ᐉ\b\uf088⩯ᐉ\u0000", new Object[]{"b", "c", "d", "e", "f", "g", "i"});
            case NEW_MUTABLE_INSTANCE:
                return new avtw();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (avtw.class) {
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
