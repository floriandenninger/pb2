package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asfo extends aonm implements aooz {
    public static final asfo a;
    private static volatile aopf d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        asfo asfoVar = new asfo();
        a = asfoVar;
        aonm.registerDefaultInstance(asfo.class, asfoVar);
    }

    private asfo() {
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
                return newMessageInfo(a, "\u0001\u000f\u0001\u0000\ue32bᯋﻗ恡\u000f\u0000\u0000\u000f\ue32bᯋᐼ\u0000\ue9fd᷆ᐼ\u0000\uf321Ẑᐼ\u0000\uf092Ἂᐼ\u0000\uf437Ἳᐼ\u0000\uf26a⤒ᐼ\u0000\uf88a\u2cf8ᐼ\u0000\uec26ⷙᐼ\u0000\uefcf⸵ᐼ\u0000\uf28f㲟ᐼ\u0000\ue91b㲾ᐼ\u0000\ue923䶡ᐼ\u0000\ue611媯ᐼ\u0000\ueb32彣ᐼ\u0000ﻗ恡ᐼ\u0000", new Object[]{"c", "b", awhb.class, awhc.class, aqdt.class, awhd.class, awhq.class, asjh.class, atiy.class, atcr.class, atcf.class, awhs.class, avmv.class, aqzh.class, astm.class, aqlb.class, auwv.class});
            case NEW_MUTABLE_INSTANCE:
                return new asfo();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (asfo.class) {
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
