package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class assn extends aonm implements aooz {
    public static final assn a;
    private static volatile aopf b;
    private int c;
    private aqft d;
    private asra e;
    private assk f;
    private assq g;
    private atdw h;
    private assj i;
    private assm j;
    private byte k = 2;

    static {
        assn assnVar = new assn();
        a = assnVar;
        aonm.registerDefaultInstance(assn.class, assnVar);
    }

    private assn() {
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001﵇Ὲﱉ䒃\u0007\u0000\u0000\u0007﵇Ὲᐉ\n\ue87aℂᐉ\u0000\ue90f⡜ᐉ\u0007\ue0de⤦ᐉ\t\uf02dⴱᐉ\f\ue55b㟮ᐉ\u0001ﱉ䒃ᐉ\r", new Object[]{"c", "h", "d", "f", "g", "i", "e", "j"});
            case NEW_MUTABLE_INSTANCE:
                return new assn();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (assn.class) {
                        aopfVar = b;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            b = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
