package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aude extends aonm implements aooz {
    public static final aude a;
    private static volatile aopf k;
    public int b;
    public audj c;
    public avzv d;
    public aphj e;
    public aqgn f;
    public auja g;
    public aqex h;
    public atdn i;
    public avgr j;
    private byte l = 2;

    static {
        aude audeVar = new aude();
        a = audeVar;
        aonm.registerDefaultInstance(aude.class, audeVar);
    }

    private aude() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.l);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.l = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\b\u0000\u0001\ue1d6\u181e\uf6ce淸\b\u0000\u0000\b\ue1d6\u181eᐉ\u0001\ue108\u196eᐉ\u0000\ue592᯦ᐉ\u0006\uee1dἍᐉ\u0002\uf5b1⼞ᐉ\u0003\uecec䦨ᐉ\u0004\uf72c䰍ᐉ\u0005\uf6ce淸ᐉ\u0007", new Object[]{"b", "d", "c", "i", "e", "f", "g", "h", "j"});
            case NEW_MUTABLE_INSTANCE:
                return new aude();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = k;
                if (aopfVar == null) {
                    synchronized (aude.class) {
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
